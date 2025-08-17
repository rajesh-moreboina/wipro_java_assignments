import React, { Component } from "react";
import MenuItem from "./MenuItem";

class Restaurant extends Component {
  render() {
    const restaurantName = "Restaurant Name: Food Paradise";
    const location = "Block B, Ground Floor";
    const openHours = "10:00 AM - 10:00 PM";

    const menu = [
      { id: 1, name: "Pizza", price: 250, category: "Fast Food", available: "Yes" },
      { id: 2, name: "Burger", price: 120, category: "Fast Food", available: "Yes" },
      { id: 3, name: "Pasta", price: 200, category: "Italian", available: "No" },
      { id: 4, name: "Salad", price: 100, category: "Healthy", available: "Yes" }
    ];

    return (
      <div>
        <h2>{restaurantName}</h2>
        <p>Location: {location}</p>
        <p>Open Hours: {openHours}</p>
       
        <h3>Restaurant Menu:</h3>
        {menu.map((item) => (
          <MenuItem
            key={item.id}
            name={item.name}
            price={item.price}
            category={item.category}
            available={item.available}
          />
        ))}
      </div>
    );
  }
}

export default Restaurant;
