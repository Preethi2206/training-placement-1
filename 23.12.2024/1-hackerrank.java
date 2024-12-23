public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153, sum = 0, temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        System.out.println(n + " is " + (n == sum ? "Armstrong" : "Not Armstrong"));
    }
}
