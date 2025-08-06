import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        double result = sum / n;
        System.out.printf("%.12f", result);
    }
}
