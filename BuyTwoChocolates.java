public class BuyTwoChocolates {

    public static int buyChoco(int[] prices, int money) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < first) {
                second = first;
                first = price;
            } else if (price < second) {
                second = price;
            }
        }

        int cost = first + second;

        if (cost <= money)
            return money - cost;
        else
            return money;
    }

    public static void main(String[] args) {

        int[] prices = {1, 2, 2};
        int money = 3;

        System.out.println("Remaining Money: " + buyChoco(prices, money));
    }
}