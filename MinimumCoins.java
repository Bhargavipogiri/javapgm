public class MinimumCoins {
    public static void main(String[] args) {
        int amount = 93;
        int[] coins = {50, 20, 10, 5, 2, 1};

        for (int coin : coins) {
            while (amount >= coin) {
                System.out.print(coin + " ");
                amount -= coin;
            }
        }
    }
}