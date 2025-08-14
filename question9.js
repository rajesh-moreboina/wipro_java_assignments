// JSON array to store tax records
let taxRecords = [];

// Tax calculation function
function calculateTax(name, pan, income, callback) {
  let tax = 0;

  // Slab method
  if (income <= 250000) {
    tax = 0;
  } else if (income <= 500000) {
    tax = (income - 250000) * 0.05;
  } else if (income <= 1000000) {
    tax = (250000 * 0.05) + (income - 500000) * 0.2;
  } else {
    tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
  }

  // Execute the callback with details
  callback({ name, pan, income, tax });
}

// Callback 1: Log to console
function logToConsole(details) {
  console.log(`Name: ${details.name}`);
  console.log(`PAN: ${details.pan}`);
  console.log(`Income: ₹${details.income}`);
  console.log(`Tax: ₹${details.tax}`);
}

// Callback 2: Display on page
function displayOnPage(details) {
  document.getElementById("output").textContent =
    `Name: ${details.name}\nPAN: ${details.pan}\nIncome: ₹${details.income}\nTax: ₹${details.tax}`;
}

// Callback 3: Save to records
function saveToRecords(details) {
  taxRecords.push(details);
  document.getElementById("records").textContent = JSON.stringify(taxRecords, null, 2);
}

// Function to handle button click
function handleTaxCalculation() {
  const name = document.getElementById("name").value;
  const pan = document.getElementById("pan").value;
  const income = Number(document.getElementById("income").value);

  calculateTax(name, pan, income, function (details) {
    logToConsole(details);
    displayOnPage(details);
    saveToRecords(details);
  });
}
