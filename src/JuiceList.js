import React from "react";
import Juice from "./Juice";

const JuiceList = () => {
  const juices = [
    { id: 1, name: "Orange Juice", price: 50 },
    { id: 2, name: "Apple Juice", price: 60 },
    { id: 3, name: "Mango Juice", price: 70 },
    { id: 4, name: "Grape Juice", price: 55 }
  ];

  return (
    <div>
      <h2>Juice List</h2>
      <table border="1" cellPadding="8" cellSpacing="0">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {juices.map((juice) => (
            <Juice key={juice.id} id={juice.id} name={juice.name} price={juice.price} />
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default JuiceList;
