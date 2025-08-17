import React from "react";
import CanteenItem from "./CanteenItem";

const CanteenMenu = () => {
  const items = [
    { id: 1, name: "Idli", price: 30, category: "Breakfast", available: "Yes" },
    { id: 2, name: "Dosa", price: 50, category: "Breakfast", available: "Yes" },
    { id: 3, name: "Vada", price: 20, category: "Snack", available: "No" },
    { id: 4, name: "Poori", price: 40, category: "Breakfast", available: "Yes" },
    { id: 5, name: "Meals", price: 120, category: "Lunch", available: "Yes" }
  ];

  return (
    <div>
      <h2>Canteen Name: Campus Food Court</h2>
      <p>Location: Block A, Ground Floor</p>
      <p>Open Hours: 8:00 AM - 8:00 PM</p>
     
      <h3>Canteen Menu:</h3>
      <ul>
        {items.map((item) => (
          <CanteenItem
            key={item.id}
            name={item.name}
            price={item.price}
            category={item.category}
            available={item.available}
          />
        ))}
      </ul>
    </div>
  );
};

export default CanteenMenu;
