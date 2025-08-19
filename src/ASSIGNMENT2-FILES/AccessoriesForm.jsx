// src/ASSIGNMENT2-FILES/AccessoriesForm.jsx
import React, { Component } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

class AccessoriesForm extends Component {
  constructor(props) {
    super(props);
    this.state = {
      accessoryName: "",
      description: "",
      category: "",
      brand: "",
      inStock: false,
      warranty: "",
      submitted: null
    };
  }

  handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    this.setState({
      [name]: type === "checkbox" ? checked : value
    });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    this.setState({
      submitted: {
        accessoryName: this.state.accessoryName,
        description: this.state.description,
        category: this.state.category,
        brand: this.state.brand,
        inStock: this.state.inStock ? "Yes" : "No",
        warranty: this.state.warranty
      },
      accessoryName: "",
      description: "",
      category: "",
      brand: "",
      inStock: false,
      warranty: ""
    });
  };

  render() {
    return (
      <div className="container mt-4">
        <div className="card shadow p-4">
          <h2 className="mb-3 text-center">Accessories Form</h2>
          <form onSubmit={this.handleSubmit}>
            {/* Accessory Name */}
            <div className="form-group mb-3">
              <label>Accessory Name</label>
              <input
                type="text"
                name="accessoryName"
                className="form-control"
                value={this.state.accessoryName}
                onChange={this.handleChange}
                required
              />
            </div>

            {/* Description */}
            <div className="form-group mb-3">
              <label>Description</label>
              <textarea
                name="description"
                className="form-control"
                value={this.state.description}
                onChange={this.handleChange}
                required
              />
            </div>

            {/* Category */}
            <div className="form-group mb-3">
              <label>Category</label>
              <select
                name="category"
                className="form-control"
                value={this.state.category}
                onChange={this.handleChange}
                required
              >
                <option value="">-- Select --</option>
                <option value="Electronics">Electronics</option>
                <option value="Fashion">Fashion</option>
                <option value="Home">Home</option>
              </select>
            </div>

            {/* Brand (Radio) */}
            <div className="form-group mb-3">
              <label>Brand</label>
              <div>
                <input
                  type="radio"
                  name="brand"
                  value="Brand A"
                  checked={this.state.brand === "Brand A"}
                  onChange={this.handleChange}
                />{" "}
                Brand A
                <br />
                <input
                  type="radio"
                  name="brand"
                  value="Brand B"
                  checked={this.state.brand === "Brand B"}
                  onChange={this.handleChange}
                />{" "}
                Brand B
              </div>
            </div>

            {/* In Stock (Checkbox) */}
            <div className="form-group mb-3">
              <input
                type="checkbox"
                name="inStock"
                checked={this.state.inStock}
                onChange={this.handleChange}
              />{" "}
              Available in Stock
            </div>

            {/* Warranty */}
            <div className="form-group mb-3">
              <label>Warranty (years)</label>
              <input
                type="number"
                name="warranty"
                className="form-control"
                value={this.state.warranty}
                onChange={this.handleChange}
              />
            </div>

            <button type="submit" className="btn btn-success w-100">
              Submit
            </button>
          </form>
        </div>

        {/* Submitted Table */}
        {this.state.submitted && (
          <div className="card mt-4 p-4 shadow">
            <h3 className="mb-3">Submitted Accessory Details</h3>
            <table className="table table-bordered">
              <tbody>
                <tr>
                  <th>Accessory Name</th>
                  <td>{this.state.submitted.accessoryName}</td>
                </tr>
                <tr>
                  <th>Description</th>
                  <td>{this.state.submitted.description}</td>
                </tr>
                <tr>
                  <th>Category</th>
                  <td>{this.state.submitted.category}</td>
                </tr>
                <tr>
                  <th>Brand</th>
                  <td>{this.state.submitted.brand}</td>
                </tr>
                <tr>
                  <th>In Stock</th>
                  <td>{this.state.submitted.inStock}</td>
                </tr>
                <tr>
                  <th>Warranty</th>
                  <td>{this.state.submitted.warranty} years</td>
                </tr>
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

export default AccessoriesForm;
