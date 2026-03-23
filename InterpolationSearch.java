class InterpolationSearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int low = 0, high = arr.length - 1;
        int key = 40;

        while(low <= high && key >= arr[low] && key <= arr[high]) {

            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if(arr[pos] == key) {
                System.out.println("Found at position " + (pos+1));
                return;
            }

            if(arr[pos] < key)
                low = pos + 1;
            else
                high = pos - 1;
        }

        System.out.println("Not found");
    }
}