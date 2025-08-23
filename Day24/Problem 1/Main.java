import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] candies = new int[n];

        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        int lastChild = 1;

        for (int i = 0; i < n; i++) {
            int rounds = (candies[i] + m - 1) / m;
            if (rounds >= (candies[lastChild - 1] + m - 1) / m) {
                lastChild = i + 1;
            }
        }

        System.out.println(lastChild);
    }
}
