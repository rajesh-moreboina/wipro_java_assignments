import React, { Component } from "react";

//MarriageForm class component
class MarriageForm extends Component {
  constructor(props) {
    super(props);
    this.state = {
      brideName: "",
      groomName: "",
      date: "",
      venue: "",
      submitted: null
    };
  }

  handleChange = (e) => {
    this.setState({
      [e.target.name]: e.target.value//[e.target.name] → dynamic property name in the state:
    });
  };

  handleSubmit = (e) => {
    e.preventDefault();//prevents the page from refreshing on form submission.
    this.setState({
      submitted: {
        brideName: this.state.brideName,
        groomName: this.state.groomName,
        date: this.state.date,
        venue: this.state.venue
      },
      brideName: "",
      groomName: "",
      date: "",
      venue: ""
    });
  };

  render() {
    return (
      <div className="container mt-4">
        {/* Form Section */}
        <div className="card shadow p-4">
          <h2 className="mb-4 text-center">Marriage Registration Form</h2>
          <form onSubmit={this.handleSubmit}>
            {/* Bride Name */}
            <div className="form-group mb-3">
              <label><strong>Bride Name</strong></label>
              <input
                type="text"
                name="brideName"
                value={this.state.brideName}
                onChange={this.handleChange}
                className="form-control"
                placeholder="Enter Bride's Name"
                required
              />
            </div>

            {/* Groom Name */}
            <div className="form-group mb-3">
              <label><strong>Groom Name</strong></label>
              <input
                type="text"
                name="groomName"
                value={this.state.groomName}
                onChange={this.handleChange}
                className="form-control"
                placeholder="Enter Groom's Name"
                required
              />
            </div>

            {/* Date */}
            <div className="form-group mb-3">
              <label><strong>Marriage Date</strong></label>
              <input
                type="date"
                name="date"
                value={this.state.date}
                onChange={this.handleChange}
                className="form-control"
                required
              />
            </div>

            {/* Venue */}
            <div className="form-group mb-3">
              <label><strong>Venue</strong></label>
              <input
                type="text"
                name="venue"
                value={this.state.venue}
                onChange={this.handleChange}
                className="form-control"
                placeholder="Enter Venue"
                required
              />
            </div>

            <button type="submit" className="btn btn-primary w-100">
              Submit
            </button>
          </form>
        </div>

        {/* Submitted Details Section */}
        {this.state.submitted && (
          <div className="card mt-4 p-4 shadow">
            <h3 className="mb-3 text-center">Submitted Marriage Details</h3>
            <ul className="list-group">
              <li className="list-group-item">
                <strong>Bride:</strong> {this.state.submitted.brideName}
              </li>
              <li className="list-group-item">
                <strong>Groom:</strong> {this.state.submitted.groomName}
              </li>
              <li className="list-group-item">
                <strong>Date:</strong> {this.state.submitted.date}
              </li>
              <li className="list-group-item">
                <strong>Venue:</strong> {this.state.submitted.venue}
              </li>
            </ul>
          </div>
        )}
      </div>
    );
  }
}

export default MarriageForm;
