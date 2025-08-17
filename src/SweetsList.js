import React from "react";

const SweetsList = () => {
  const sweets = [
    { id: 1, name: "Ladoo", price: 20 },
    { id: 2, name: "Jalebi", price: 30 },
    { id: 3, name: "Rasgulla", price: 40 },
    { id: 4, name: "Gulab Jamun", price: 50 }
  ];

  return (
    <div>
      <h2>Sweets List</h2>
      <ul>
        {sweets.map((sweet) => (
          <li key={sweet.id}>
            {sweet.name} - Price: ₹{sweet.price}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default SweetsList;
