import React, { Component } from "react";
import FruitList from "./FruitList"; // import child
//class component
class FruitsApp extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fruits: ["Apple", "Banana", "Mango"],
      newFruit: ""
    };
  }

  handleChange = (e) => {
    //e.target.value is the current input value.
    this.setState({ newFruit: e.target.value });
  };

  addFruit = () => {
    if (this.state.newFruit.trim() !== "") {
      this.setState({
        fruits: [...this.state.fruits, this.state.newFruit],//spread operator to create a new array
        newFruit: ""
      });
    }
  };

  render() {
    return (
      <div style={{ padding: "20px" }}>
        <h2>Fruit Manager</h2>
        <input
          type="text"
          value={this.state.newFruit}
          onChange={this.handleChange}
          placeholder="Enter fruit name"
        />
        <button onClick={this.addFruit} style={{ marginLeft: "10px" }}>
          Add Fruit
        </button>

        {/* Pass fruits to child */}
        <FruitList fruits={this.state.fruits} />
      </div>
    );
  }
}

export default FruitsApp;
