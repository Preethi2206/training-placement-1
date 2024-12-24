import java.util.Scanner;
public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();
        System.out.println("Armstrong Numbers:");
        for (int i = start; i <= end; i++) {
            int num = i, sum = 0, temp;
            while (num > 0) {
                temp = num % 10;
                sum += temp * temp * temp;
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
