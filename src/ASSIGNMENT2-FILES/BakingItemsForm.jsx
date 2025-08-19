// src/ASSIGNMENT2-FILES/BakingItemsForm.jsx
import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

const BakingItemsForm = () => {
  const [form, setForm] = useState({
    itemName: "",
    quantity: "",
    ingredients: "",
    bakingTime: "",
    category: ""
  });

  const [items, setItems] = useState([]);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setForm({ ...form, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setItems([...items, form]);
    setForm({
      itemName: "",
      quantity: "",
      ingredients: "",
      bakingTime: "",
      category: ""
    });
  };

  return (
    <div className="container mt-4">
      <div className="card p-4 shadow">
        <h2 className="mb-3 text-center">Baking Items Form</h2>
        <form onSubmit={handleSubmit}>
          
          {/* Item Name */}
          <div className="form-group mb-3">
            <label><strong>Item Name</strong></label>
            <input
              type="text"
              className="form-control"
              name="itemName"
              value={form.itemName}
              onChange={handleChange}
              required
            />
          </div>

          {/* Quantity */}
          <div className="form-group mb-3">
            <label><strong>Quantity</strong></label>
            <input
              type="number"
              className="form-control"
              name="quantity"
              value={form.quantity}
              onChange={handleChange}
              required
            />
          </div>

          {/* Ingredients */}
          <div className="form-group mb-3">
            <label><strong>Ingredients</strong></label>
            <textarea
              className="form-control"
              name="ingredients"
              value={form.ingredients}
              onChange={handleChange}
              required
            />
          </div>

          {/* Baking Time */}
          <div className="form-group mb-3">
            <label><strong>Baking Time (minutes)</strong></label>
            <input
              type="number"
              className="form-control"
              name="bakingTime"
              value={form.bakingTime}
              onChange={handleChange}
              required
            />
          </div>

          {/* Category */}
          <div className="form-group mb-3">
            <label><strong>Category</strong></label>
            <select
              className="form-control"
              name="category"
              value={form.category}
              onChange={handleChange}
              required
            >
              <option value="">Select Category</option>
              <option value="Cake">Cake</option>
              <option value="Bread">Bread</option>
              <option value="Pastry">Pastry</option>
            </select>
          </div>

          <button type="submit" className="btn btn-success w-100">
            Add Baking Item
          </button>
        </form>
      </div>

      {/* Baking Items List */}
      {items.length > 0 && (
        <div className="card mt-4 p-4 shadow">
          <h3 className="text-center mb-3">Baking Items List</h3>
          <table className="table table-bordered table-striped">
            <thead>
              <tr>
                <th>Item Name</th>
                <th>Quantity</th>
                <th>Ingredients</th>
                <th>Baking Time</th>
                <th>Category</th>
              </tr>
            </thead>
            <tbody>
              {items.map((item, index) => (
                <tr key={index}>
                  <td>{item.itemName}</td>
                  <td>{item.quantity}</td>
                  <td>{item.ingredients}</td>
                  <td>{item.bakingTime} min</td>
                  <td>{item.category}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      )}
    </div>
  );
};

export default BakingItemsForm;
