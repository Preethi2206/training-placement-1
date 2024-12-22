import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        System.out.println((count == 2) ? "Prime" : "Not Prime");
    }
}
