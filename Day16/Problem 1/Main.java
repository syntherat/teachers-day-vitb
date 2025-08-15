import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int totalTime = 0;
        int currentHouse = 1;

        for (int i = 0; i < m; i++) {
            int nextHouse = sc.nextInt();

            // Calculate clockwise distance
            int clockwise = (nextHouse - currentHouse + n) % n;

            totalTime += clockwise;
            currentHouse = nextHouse;
        }

        System.out.println(totalTime);
    }
}