public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15};
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        System.out.println(max);
    }
}
