import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int minCost = Integer.MAX_VALUE;

        for (int mTickets = 0; mTickets <= (n + m - 1) / m; mTickets++) {
            int ridesFromMTickets = mTickets * m;
            int remainingRides = Math.max(0, n - ridesFromMTickets);
            int cost = mTickets * b + remainingRides * a;
            minCost = Math.min(minCost, cost);
        }

        System.out.println(minCost);
    }
}