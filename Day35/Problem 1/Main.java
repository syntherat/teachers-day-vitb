import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];

            int totalSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                totalSum += a[i];
            }

            if (totalSum % x != 0) {
                System.out.println(n);
                continue;
            }

            int left = 0;
            while (left < n && a[left] % x == 0) {
                left++;
            }

            int right = n - 1;
            while (right >= 0 && a[right] % x == 0) {
                right--;
            }

            if (left == n) {
                System.out.println(-1);
            } else {
                System.out.println(n - Math.min(left + 1, n - right));
            }
        }
    }
}
