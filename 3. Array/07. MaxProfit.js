const maxProfit = prices => {
  let minPrice = prices[0];
  let maxProfit = 0;

  for (let index = 0; index < prices.length; index++) {
    const currentPrice = prices[index];
    if (currentPrice < minPrice) {
      minPrice = currentPrice;
    }

    const potentialProfit = currentPrice - minPrice;
    if (potentialProfit > maxProfit) {
      maxProfit = potentialProfit;
    }
  }

  return maxProfit;
}

const prices = [7, 1, 5, 3, 6, 4];
const profit = maxProfit(prices);
console.log("Maximum Profit:", profit);