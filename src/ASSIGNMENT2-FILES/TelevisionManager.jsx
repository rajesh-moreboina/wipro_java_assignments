import React, { Component } from "react";

// Functional Component (Child)
const TelevisionList = ({ models }) => {
  return (
    <div>
      <h3>Television Models</h3>
      <ul>
        {models.map((model, index) => (
          <li key={index}>{model}</li>
        ))}
      </ul>
    </div>
  );
};

//  Class Component (Parent)
class TelevisionManager extends Component {
  constructor(props) {
    super(props);
    this.state = {
      models: ["Samsung QLED", "Sony Bravia", "LG OLED"],//array of initial TV models.
      newModel: ""//controlled input value.
    };
  }

  handleChange = (e) => {
    this.setState({ newModel: e.target.value });
  };

  addModel = () => {
    if (this.state.newModel.trim() !== "") {
      this.setState({
        models: [...this.state.models, this.state.newModel], // spread operator creates a new array (immutable update).
        newModel: ""
      });
    }
  };

  render() {
    return (
      <div style={{ padding: "20px" }}>
        <h2>Television Manager</h2>
        <input
          type="text"
          value={this.state.newModel}
          onChange={this.handleChange}
          placeholder="Enter television model"
        />
        <button onClick={this.addModel} style={{ marginLeft: "10px" }}>
          Add Model
        </button>

        {/* Pass models to child */}
        <TelevisionList models={this.state.models} />
      </div>
    );
  }
}

export default TelevisionManager;
