import React, { Component } from "react";

class MenuItem extends Component {
  render() {
    const { name, price, category, available } = this.props;
    return (
      <div>
        <p>
          <strong>{name}</strong> - Price: ₹{price} - Category: {category} - Available: {available}
        </p>
      </div>
    );
  }
}

export default MenuItem;
