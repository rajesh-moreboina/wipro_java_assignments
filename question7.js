// ----- Player 1 (as given in the question) -----
const player = {
  name: "Virat Kohli",
  age: 36,
  sport: "Cricket",
  stats: {
    matches: 500,
    runs: 25000,
    average: 57.2
  }
};

// 1) Object destructuring for player 1
const {
  name: name1,
  sport: sport1,
  stats: { matches: matches1, runs, average }
} = player;

// Build output text
let output = "";
output += `Player ${name1} plays ${sport1}.\n`;
output += `Matches: ${matches1} | Runs: ${runs} | Batting Average: ${average}\n`;

// ----- Player 2 (add another player) -----
const player2 = {
  name: "Lionel Messi",
  age: 38,
  sport: "Football",
  stats: {
    matches: 800,
    goals: 720,
    assists: 300
  }
};

// 3) Put both players into an array and use array destructuring
const players = [player, player2];
const [p1, p2] = players;

// Destructure player 2
const {
  name: name2,
  sport: sport2,
  stats: { matches: matches2, goals, assists }
} = p2;

// Append player 2 output (similar format)
output += `Player ${name2} plays ${sport2}.\n`;
output += `Matches: ${matches2} | Goals: ${goals} | Assists: ${assists}`;

// Print to console (optional for checking)
console.log(output);

// Show on the page
document.getElementById("output").textContent = output;
