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

import Phone from "./Phone";

import SweetsList from "./SweetsList";

import Electronics from "./Electronics";

import CanteenMenu from "./CanteenMenu";

import JuiceList from "./JuiceList";

import Restaurant from "./Restaurant";

import TempleList from "./TempleList";

import TailorShop from "./TailorShop";

import "bootstrap/dist/css/bootstrap.min.css";


function App() {
  const groceries = ["Rice", "Wheat", "Sugar", "Milk", "Oil"];

  return (
    <div>
      {/* Question 1: Grocery List */}
      <GroceryList items={groceries} />

      <hr /> {/* horizontal line to separate sections */}

      {/* Question 2: Car Details */}
      <Car brand="Toyota" model="Fortuner" color="Black" year="2022" />

            <hr />

      {/* Question 3: Phone */}
      <Phone />

       <hr />

      {/* Question 4: Sweets List */}
      <SweetsList />
       <hr />

      {/* Question 5: Electronics */}
     <Electronics />

     <hr />
 {/* Question 6: Canteen */}
      <CanteenMenu />

      <hr />
       {/* Question 7: Juice */}
<JuiceList />
  {/* Question 8: Restaurant */}
<hr />
<Restaurant />

  {/* Question 9: TempleList */}
<hr />
<TempleList />

  {/* Question 10: Tailorshop */}

  <hr />
<TailorShop />
    </div>
  );
}

export default App;
