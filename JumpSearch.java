import java.lang.Math;

class JumpSearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 13};
        int n = arr.length;
        int key = 9;

        int step = (int)Math.sqrt(n);
        int prev = 0;

        while(arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int)Math.sqrt(n);
            if(prev >= n) {
                System.out.println("Not found");
                return;
            }
        }

        for(int i = prev; i < Math.min(step, n); i++) {
            if(arr[i] == key) {
                System.out.println("Found at position " + (i+1));
                return;
            }
        }

        System.out.println("Not found");
    }
}