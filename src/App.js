// // import React from "react";
// // import GroceryList from "./GroceryList";

// // function App() {
// //   const groceries = ["Rice", "Wheat", "Sugar", "Milk", "Oil"];

// //   return (
// //     <div>
// //       <GroceryList items={groceries} />
// //     </div>
// //   );
// // }

// // export default App;

// import React from "react";
// import Car from "./Car";

// function App() {
//   return (
//     <div>
//       <Car brand="Toyota" model="Fortuner" color="Black" year="2022" />
//     </div>
//   );
// }

// export default App;
import React from "react";
import GroceryList from "./GroceryList";
import Car from "./Car";

function App() {
  const groceries = ["Rice", "Wheat", "Sugar", "Milk", "Oil"];

  return (
    <div>
      {/* Question 1: Grocery List */}
      <GroceryList items={groceries} />

      <hr /> {/* horizontal line to separate sections */}

      {/* Question 2: Car Details */}
      <Car brand="Toyota" model="Fortuner" color="Black" year="2022" />
    </div>
  );
}

export default App;
