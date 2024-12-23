public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            }
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("Element not found");
    }
}
