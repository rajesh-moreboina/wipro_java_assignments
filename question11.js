// Helper function to print messages to the webpage
function printMessage(message) {
    document.getElementById("output").innerHTML += message + "<br>";
}

function createPortfolio() {
    let portfolio = []; // Private array

    function buyShare(company, quantity, price) {
        let stock = portfolio.find(item => item.company === company);
        if (stock) {
            stock.quantity += quantity;
            stock.price = price;
        } else {
            portfolio.push({ company, quantity, price });
        }
        printMessage(`Bought ${quantity} shares of ${company} at \u20B9${price} each.`);
    }

    function sellShare(company, quantity) {
        let stock = portfolio.find(item => item.company === company);
        if (stock) {
            if (stock.quantity >= quantity) {
                stock.quantity -= quantity;
                printMessage(`Sold ${quantity} shares of ${company}.`);
                if (stock.quantity === 0) {
                    portfolio = portfolio.filter(item => item.company !== company);
                }
            } else {
                printMessage(`Not enough shares of ${company} to sell.`);
            }
        } else {
            printMessage(`No shares of ${company} found in portfolio.`);
        }
    }

    function totalValue() {
        let value = portfolio.reduce((sum, stock) => sum + (stock.quantity * stock.price), 0);
        printMessage(`Portfolio Value: \u20B9${value}`);
    }

    return {
        buyShare,
        sellShare,
        totalValue
    };
}

// Example usage
const myPortfolio = createPortfolio();
myPortfolio.buyShare("TCS", 10, 3500);
myPortfolio.buyShare("Infosys", 5, 1500);
myPortfolio.sellShare("TCS", 3);
myPortfolio.totalValue();
