import React, { Component, createRef } from "react";

class FlightBookingUncontrolled extends Component {
  constructor(props) {
    super(props);
    this.flightNoRef = createRef();
    this.sourceRef = createRef();
    this.destRef = createRef();
    this.dateRef = createRef();
    this.termsRef = createRef();
    this.state = { submitted: null };
  }

  handleSubmit = (e) => {
    e.preventDefault();
    this.setState({
      submitted: {
        flightNo: this.flightNoRef.current.value,
        source: this.sourceRef.current.value,
        destination: this.destRef.current.value,
        travelDate: this.dateRef.current.value,
        terms: this.termsRef.current.checked ? "Accepted" : "Not Accepted",
      },
    });
  };

  render() {
    return (
      <div className="container my-4">
        <h2 className="mb-3 text-success">Uncontrolled Flight Booking Form</h2>
        <form onSubmit={this.handleSubmit} className="card p-3 shadow">
          <div className="mb-3">
            <label className="form-label">Flight Number</label>
            <input type="text" className="form-control" ref={this.flightNoRef} />
          </div>

          <div className="mb-3">
            <label className="form-label">Source</label>
            <input type="text" className="form-control" ref={this.sourceRef} />
          </div>

          <div className="mb-3">
            <label className="form-label">Destination</label>
            <input type="text" className="form-control" ref={this.destRef} />
          </div>

          <div className="mb-3">
            <label className="form-label">Travel Date</label>
            <input type="date" className="form-control" ref={this.dateRef} />
          </div>

          <div className="form-check mb-3">
            <input type="checkbox" className="form-check-input" ref={this.termsRef} />
            <label className="form-check-label">Accept Terms</label>
          </div>

          <button type="submit" className="btn btn-success">
            Submit
          </button>
        </form>

        {this.state.submitted && (
          <div className="card mt-4 p-3 shadow">
            <h5>Submitted Details</h5>
            <p><b>Flight Number:</b> {this.state.submitted.flightNo}</p>
            <p><b>Source:</b> {this.state.submitted.source}</p>
            <p><b>Destination:</b> {this.state.submitted.destination}</p>
            <p><b>Travel Date:</b> {this.state.submitted.travelDate}</p>
            <p><b>Terms:</b> {this.state.submitted.terms}</p>
          </div>
        )}
      </div>
    );
  }
}

export default FlightBookingUncontrolled;
