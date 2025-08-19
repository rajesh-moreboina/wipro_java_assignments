import React, { Component } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

class MovieForm extends Component {
  constructor(props) {
    super(props);
    console.log("constructor executed");

    this.state = {
      title: "",
      director: "",
      year: "",
      genre: "",
      rating: "",
      description: "",
      platforms: {
        netflix: false,
        prime: false,
        disney: false,
        others: false,
      },
      movies: [],
    };
  }

  static getDerivedStateFromProps(props, state) {
    console.log("getDerivedStateFromProps executed");
    return null; // no state update from props
  }

  componentDidMount() {
    console.log("componentDidMount executed");
  }

  shouldComponentUpdate(nextProps, nextState) {
    console.log("shouldComponentUpdate executed");
    return true; // allow updates
  }

  getSnapshotBeforeUpdate(prevProps, prevState) {
    console.log("getSnapshotBeforeUpdate executed");
    return null;
  }

  componentDidUpdate(prevProps, prevState, snapshot) {
    console.log("componentDidUpdate executed");
  }

  componentWillUnmount() {
    console.log("componentWillUnmount executed");
  }

  handleChange = (e) => {
    const { name, value, type, checked } = e.target;

    if (type === "checkbox") {
      this.setState((prevState) => ({
        platforms: {
          ...prevState.platforms,
          [name]: checked,
        },
      }));
    } else {
      this.setState({ [name]: value });
    }
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const newMovie = {
      title: this.state.title,
      director: this.state.director,
      year: this.state.year,
      genre: this.state.genre,
      rating: this.state.rating,
      description: this.state.description,
      platforms: Object.keys(this.state.platforms)
        .filter((p) => this.state.platforms[p])
        .join(", "),
    };

    this.setState((prevState) => ({
      movies: [...prevState.movies, newMovie],
      // reset form fields
      title: "",
      director: "",
      year: "",
      genre: "",
      rating: "",
      description: "",
      platforms: {
        netflix: false,
        prime: false,
        disney: false,
        others: false,
      },
    }));
  };

  render() {
    console.log("render executed");
    return (
      <div className="container mt-4">
        <div className="card p-4 shadow">
          <h3 className="mb-3">Add Movie</h3>
          <form onSubmit={this.handleSubmit}>
            <div className="mb-3">
              <label className="form-label">Movie Title</label>
              <input
                type="text"
                name="title"
                value={this.state.title}
                onChange={this.handleChange}
                className="form-control"
                required
              />
            </div>

            <div className="mb-3">
              <label className="form-label">Director</label>
              <input
                type="text"
                name="director"
                value={this.state.director}
                onChange={this.handleChange}
                className="form-control"
                required
              />
            </div>

            <div className="mb-3">
              <label className="form-label">Release Year</label>
              <input
                type="number"
                name="year"
                value={this.state.year}
                onChange={this.handleChange}
                className="form-control"
                required
              />
            </div>

            <div className="mb-3">
              <label className="form-label">Genre</label>
              <select
                name="genre"
                value={this.state.genre}
                onChange={this.handleChange}
                className="form-control"
                required
              >
                <option value="">Select Genre</option>
                <option>Action</option>
                <option>Comedy</option>
                <option>Drama</option>
                <option>Sci-Fi</option>
                <option>Horror</option>
              </select>
            </div>

            <div className="mb-3">
              <label className="form-label">Rating</label>
              <div>
                {[1, 2, 3, 4, 5].map((num) => (
                  <div className="form-check form-check-inline" key={num}>
                    <input
                      type="radio"
                      name="rating"
                      value={num}
                      checked={this.state.rating === num.toString()}
                      onChange={this.handleChange}
                      className="form-check-input"
                    />
                    <label className="form-check-label">{num}</label>
                  </div>
                ))}
              </div>
            </div>

            <div className="mb-3">
              <label className="form-label">Description</label>
              <textarea
                name="description"
                value={this.state.description}
                onChange={this.handleChange}
                className="form-control"
                required
              ></textarea>
            </div>

            <div className="mb-3">
              <label className="form-label">Available on Platforms</label>
              <div>
                {["netflix", "prime", "disney", "others"].map((platform) => (
                  <div className="form-check form-check-inline" key={platform}>
                    <input
                      type="checkbox"
                      name={platform}
                      checked={this.state.platforms[platform]}
                      onChange={this.handleChange}
                      className="form-check-input"
                    />
                    <label className="form-check-label">
                      {platform.charAt(0).toUpperCase() + platform.slice(1)}
                    </label>
                  </div>
                ))}
              </div>
            </div>

            <button type="submit" className="btn btn-primary">
              Add Movie
            </button>
          </form>
        </div>

        {this.state.movies.length > 0 && (
          <div className="mt-4">
            <h4>Movie List</h4>
            <table className="table table-bordered">
              <thead className="table-dark">
                <tr>
                  <th>Title</th>
                  <th>Director</th>
                  <th>Year</th>
                  <th>Genre</th>
                  <th>Rating</th>
                  <th>Description</th>
                  <th>Platforms</th>
                </tr>
              </thead>
              <tbody>
                {this.state.movies.map((movie, index) => (
                  <tr key={index}>
                    <td>{movie.title}</td>
                    <td>{movie.director}</td>
                    <td>{movie.year}</td>
                    <td>{movie.genre}</td>
                    <td>{movie.rating}</td>
                    <td>{movie.description}</td>
                    <td>{movie.platforms}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

export default MovieForm;
