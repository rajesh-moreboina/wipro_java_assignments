// 1. Declare building name using const
const buildingName = "Sunrise Apartments";

// 2. Declare a let variable for status
let status = "OFF";

// 3. Device names
const devices = ["Light", "Fan", "AC"];

// Output storage
let display = "";

// 4. Use var for loop counter
for (var i = 0; i < devices.length; i++) {
  // Toggle the device status
  status = (status === "OFF") ? "ON" : "OFF";

  // Print the message
  display += `Checking Switch ${i + 1}: ${devices[i]} is ${status}\n`;
}

// 5. After loop
display += `All switches checked for ${buildingName}.\n`;
display += `Outside loop: var counter is ${i}\n`;

// 6. Try reassigning const to observe error
try {
  buildingName = "New Tower"; // This will cause an error
} catch (error) {
  console.error("Error:", error.message);
  display += `(Console Error when trying to change building name)\n`;
}

// Show in page
document.getElementById("output").textContent = display;

// Also log to console
console.log(display);
