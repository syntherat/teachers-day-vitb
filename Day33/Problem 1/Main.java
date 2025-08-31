import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxLen = 1;
        int currentLen = 1;

        int prev = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int curr = sc.nextInt();
            if (curr >= prev) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            maxLen = Math.max(maxLen, currentLen);
            prev = curr;
        }

        System.out.println(maxLen);
    }
}
