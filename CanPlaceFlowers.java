public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] a = {1, 0, 0, 0, 1};
        int n = 1;

        for (int i = 0; i < a.length && n > 0; i++) {
            if (a[i] == 0 &&
                (i == 0 || a[i - 1] == 0) &&
                (i == a.length - 1 || a[i + 1] == 0)) {
                a[i] = 1;
                n--;
            }
        }

        System.out.println(n == 0);
    }
}