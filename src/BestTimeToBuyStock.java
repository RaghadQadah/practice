public class BestTimeToBuyStock {
  public static void main(String[] args) {

    int[] prices = {7, 1, 5, 3, 6, 4};

    int buyPrice = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (buyPrice > prices[i]) {
        buyPrice = prices[i];
      }
      //profit = Math.max(profit, prices[i] - buyPrice);


    }

    System.out.println(profit);


  }

  public static int getMinNum(int[] prices) {
    int indexOfmin = 0;
    for (int i = 0; i < prices.length - 2; i++) {
      if (prices[indexOfmin] > prices[i]) indexOfmin = i;
    }
    return indexOfmin;
  }

  public static int getMaxNum(int[] prices, int index) {
    int indexOfmax = index;
    for (int i = index; i < prices.length; i++) {
      if (prices[indexOfmax] < prices[i]) indexOfmax = i;
    }
    return indexOfmax;
  }
}
