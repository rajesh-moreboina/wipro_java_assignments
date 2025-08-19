// import logo from './logo.svg';
// import './App.css';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

// export default App;
import React from "react";
import FruitsApp from "./ASSIGNMENT2-FILES/FruitsApp";

import TelevisionManager from "./ASSIGNMENT2-FILES/TelevisionManager";

import MarriageForm from "./ASSIGNMENT2-FILES/MarriageForm";

import BakingItemsForm from "./ASSIGNMENT2-FILES/BakingItemsForm";

import FlightBookingControlled from "./ASSIGNMENT2-FILES/FlightBookingControlled";
import FlightBookingUncontrolled from "./ASSIGNMENT2-FILES/FlightBookingUncontrolled";

import MovieForm from "./ASSIGNMENT2-FILES/MovieForm";

import 'bootstrap/dist/css/bootstrap.min.css';


function App() {
  return (
    <div>
      <h1>Assignment React-Day2</h1>
      <FruitsApp />
<hr/>
       <TelevisionManager />
<hr/>
      <MarriageForm />
<hr/>
     <BakingItemsForm />
<hr/>
      <FlightBookingControlled />
      <FlightBookingUncontrolled />
<hr />
      <MovieForm />
    </div>
  );
}

export default App;

