import React, { useState } from "react";

const Phone = () => {
  const [phone, setPhone] = useState({
    brand: "Apple",
    model: "iPhone 16 pro max",
    price: 90000
  });

  const updatePrice = () => {
    setPhone({ ...phone, price: phone.price + 5000 });
  };

  return (
    <div>
      <h2>Phone Details</h2>
      <p>Brand: {phone.brand}</p>
      <p>Model: {phone.model}</p>
      <p>Price: ₹{phone.price}</p>
      <button onClick={updatePrice}
       style={{
          backgroundColor: "blue",
          color: "white",
          padding: "10px 20px",
          border: "none",
          borderRadius: "5px",
          cursor: "pointer"
        }}>
        Increase Price</button>
       
    </div>
  );
};

export default Phone;
