import React, { Component } from "react";

//class-based React component.
class FlightBookingControlled extends Component {
  constructor(props) {
    super(props);
    this.state = {
      passengerName: "",
      email: "",
      gender: "",
      meal: "",
      request: "",
      submitted: null,
    };
  }

  handleChange = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();//prevents page reload when form submits
    this.setState({
      submitted: {
        passengerName: this.state.passengerName,
        email: this.state.email,
        gender: this.state.gender,
        meal: this.state.meal,
        request: this.state.request,
      },
    });
  };

  render() {
    return (
      <div className="container my-4">
        <h2 className="mb-3 text-primary">Controlled Flight Booking Form</h2>
        <form onSubmit={this.handleSubmit} className="card p-3 shadow">
          <div className="mb-3">
            <label className="form-label">Passenger Name</label>
            <input
              type="text"
              className="form-control"
              name="passengerName"
              value={this.state.passengerName}
              onChange={this.handleChange}
              required
            />
          </div>

          <div className="mb-3">
            <label className="form-label">Email</label>
            <input
              type="email"
              className="form-control"
              name="email"
              value={this.state.email}
              onChange={this.handleChange}
              required
            />
          </div>

          <div className="mb-3">
            <label className="form-label d-block">Gender</label>
            <input
              type="radio"
              name="gender"
              value="Male"
              onChange={this.handleChange}
            />{" "}
            Male
            <input
              type="radio"
              name="gender"
              value="Female"
              className="ms-3"
              onChange={this.handleChange}
            />{" "}
            Female
          </div>

          <div className="mb-3">
            <label className="form-label">Meal Preference</label>
            <select
              name="meal"
              className="form-control"
              value={this.state.meal}
              onChange={this.handleChange}
              required
            >
              <option value="">--Select--</option>
              <option value="Veg">Veg</option>
              <option value="Non-Veg">Non-Veg</option>
            </select>
          </div>

          <div className="mb-3">
            <label className="form-label">Special Request</label>
            <textarea
              name="request"
              className="form-control"
              value={this.state.request}
              onChange={this.handleChange}
            />
          </div>

          <button type="submit" className="btn btn-primary">
            Submit
          </button>
        </form>
{/*{this.state.submitted && ...} → conditional rendering: only show table after submission. */}
        {this.state.submitted && (
          <div className="mt-4">
            <h5>Submitted Details</h5>
            <table className="table table-bordered">
              <tbody>
                <tr>
                  <th>Passenger Name</th>
                  <td>{this.state.submitted.passengerName}</td>
                </tr>
                <tr>
                  <th>Email</th>
                  <td>{this.state.submitted.email}</td>
                </tr>
                <tr>
                  <th>Gender</th>
                  <td>{this.state.submitted.gender}</td>
                </tr>
                <tr>
                  <th>Meal</th>
                  <td>{this.state.submitted.meal}</td>
                </tr>
                <tr>
                  <th>Special Request</th>
                  <td>{this.state.submitted.request}</td>
                </tr>
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

export default FlightBookingControlled;
