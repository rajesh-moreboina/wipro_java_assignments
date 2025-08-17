import React, { useState } from "react";

const Electronics = () => {
  const [name] = useState("Laptop");
  const [brand, setBrand] = useState("Samsung");
  const [price, setPrice] = useState(30000);

  const changeBrand = () => {
    setBrand("Apple");
  };

  const increasePrice = () => {
    setPrice(price + 5000);
  };

  return (
    <div>
      <h2>Electronics Item Details</h2>
      <p>Name: {name}</p>
      <p>Brand: {brand}</p>
      <p>Price: ₹{price}</p>
      <button onClick={changeBrand} style={{ marginRight: "10px", cursor: "pointer" }}>
        Change Brand
      </button>
      <button
        onClick={increasePrice}
        style={{
          backgroundColor: "blue",
          color: "white",
          padding: "8px 15px",
          border: "none",
          borderRadius: "5px",
          cursor: "pointer"
        }}
      >
        Increase Price
      </button>
    </div>
  );
};

export default Electronics;
