// --- helpers ---
const $ = sel => document.querySelector(sel);
const $$ = sel => document.querySelectorAll(sel);

const form = $('#rtoForm');
const progressBar = $('#formProgress');
const progressText = $('#progressText');
const submitBtn = $('#submitBtn');

const todayISO = () => new Date().toISOString().slice(0, 10);

// date limits
const dob = form.elements['dob'];
const purchaseDate = form.elements['purchaseDate'];
const insuranceExpiry = form.elements['insuranceExpiry'];
const pucTill = form.elements['pucTill'];
const agreementDate = form.elements['agreementDate'];

const eighteenYearsAgo = new Date();
eighteenYearsAgo.setFullYear(eighteenYearsAgo.getFullYear() - 18);
dob.max = eighteenYearsAgo.toISOString().slice(0, 10);

purchaseDate.max = todayISO();
insuranceExpiry.min = todayISO();
pucTill.min = todayISO();

// finance toggle
const hypo = $('#hypothecation');
const financeFields = $('#financeFields');
const bank = form.elements['bank'];

hypo.addEventListener('change', () => {
  financeFields.classList.toggle('d-none', !hypo.checked);
  // make fields required only when hypothecation = true
  bank.required = hypo.checked;
  agreementDate.required = hypo.checked;
  validateField(bank);
  validateField(agreementDate);
  updateProgress();
});

// file validation
function validFile(input, required = true) {
  if (!input.files || input.files.length === 0) return required ? false : true;
  const f = input.files[0];
  const sizeOK = f.size <= 2 * 1024 * 1024; // 2MB
  const name = f.name.toLowerCase();
  const extOK = input.name === 'vehImg'
    ? /\.(jpg|jpeg|png)$/.test(name)
    : /\.(pdf|jpg|jpeg|png)$/.test(name);
  return sizeOK && extOK;
}

// attach file listeners
['idProof','insCopy','vehImg'].forEach(n => {
  const input = form.elements[n];
  if (!input) return;
  input.addEventListener('change', () => {
    const ok = validFile(input, n !== 'vehImg');
    setValidityUI(input, ok);
    updateProgress();
  });
});

// fuel radio group validity UI
function fuelValid() {
  return [...form.elements['fuel']].some(r => r.checked);
}
function updateFuelUI() {
  const msg = document.querySelector('[data-for="fuel"]');
  msg.classList.toggle('text-danger', !fuelValid());
  msg.classList.toggle('text-success', fuelValid());
}

// generic validity + bootstrap classes
function setValidityUI(el, ok) {
  el.classList.toggle('is-valid', ok);
  el.classList.toggle('is-invalid', !ok);
}
function validateField(el) {
  let ok = el.checkValidity();
  // custom checks
  if (el === dob) ok = ok && (new Date(el.value) <= eighteenYearsAgo);
  if (el === purchaseDate) ok = ok && (new Date(el.value) <= new Date());
  if (el === insuranceExpiry) ok = ok && (new Date(el.value) >= new Date(todayISO()));
  if (el === pucTill) ok = ok && (new Date(el.value) >= new Date(todayISO()));
  if (el === agreementDate && hypo.checked) ok = ok && (new Date(el.value) <= new Date());
  if (el.type === 'file') ok = validFile(el, el.name !== 'vehImg');
  setValidityUI(el, !!el.value && ok);
  return ok;
}

// validate on input/blur
$$('input, select').forEach(el => {
  el.addEventListener('input', () => {
    if (el.name === 'pan') el.value = el.value.toUpperCase();
    if (['chassis','engine','dlno','regno'].includes(el.name)) el.value = el.value.toUpperCase();
    validateField(el);
    if (el.name === 'fuel') updateFuelUI();
    updateProgress();
  });
  el.addEventListener('blur', () => { validateField(el); updateProgress(); });
});

// captcha
let a=0,b=0,capAns=$('#capAns'),capQ=$('#capQ');
function genCaptcha() {
  a = Math.floor(Math.random()*9)+1;
  b = Math.floor(Math.random()*9)+1;
  capQ.textContent = `${a} + ${b} = ?`;
  capAns.value = '';
}
$('#capRefresh').addEventListener('click', () => { genCaptcha(); updateProgress(); });
genCaptcha();

// section validators (6 sections)
const sections = ['owner','address','vehicle','compliance','finance','uploads'];

function sectionValid(name) {
  const sec = document.querySelector(`.accordion-item[data-section="${name}"]`);
  const inputs = sec.querySelectorAll('input, select');
  let ok = true;

  inputs.forEach(el => {
    if (name === 'finance' && !hypo.checked) return; // finance optional
    if (el.type === 'radio') return; // handle fuel separately
    if (el.required || (el.type === 'file')) {
      if (!validateField(el)) ok = false;
    }
  });

  if (name === 'vehicle') ok = ok && fuelValid();
  if (name === 'uploads') {
    ok = ok && validFile(form.elements['idProof'])
             && validFile(form.elements['insCopy'])
             && (form.elements['vehImg'].files.length === 0 || validFile(form.elements['vehImg'], false));
  }
  return ok;
}

function updateProgress() {
  updateFuelUI();

  const validCounts = sections.map(s => sectionValid(s));
  const total = sections.length;
  const done = validCounts.filter(Boolean).length;

  const pct = Math.round((done/total)*100);
  progressBar.style.width = pct + '%';
  progressText.textContent = pct + '%';

  const termsOK = $('#terms').checked;
  const captchaOK = Number(capAns.value) === (a + b);

  // enable submit only when all required sections valid + terms + captcha
  submitBtn.disabled = !(done === total && termsOK && captchaOK);
}
form.addEventListener('input', updateProgress);
$('#terms').addEventListener('change', updateProgress);
capAns.addEventListener('input', updateProgress);

// submit
form.addEventListener('submit', (e) => {
  e.preventDefault();
  // final sweep to show errors if any
  sections.forEach(s => sectionValid(s));
  updateProgress();
  if (submitBtn.disabled) return;

  new bootstrap.Toast($('#successToast')).show();
  form.reset();
  financeFields.classList.add('d-none');
  bank.required = false;
  agreementDate.required = false;
  $$('input, select').forEach(el => el.classList.remove('is-valid','is-invalid'));
  genCaptcha();
  updateProgress();
});

// reset
form.addEventListener('reset', () => {
  setTimeout(() => {
    $$('input, select').forEach(el => el.classList.remove('is-valid','is-invalid'));
    financeFields.classList.add('d-none');
    bank.required = false;
    agreementDate.required = false;
    genCaptcha();
    updateProgress();
  }, 0);
});

// initial UI
updateProgress();
