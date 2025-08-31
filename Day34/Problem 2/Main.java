import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        int minCount = 0, maxCount = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
            } else if (arr[i] == min) {
                minCount++;
            }

            if (arr[i] > max) {
                max = arr[i];
                maxCount = 1;
            } else if (arr[i] == max) {
                maxCount++;
            }
        }

        long diff = max - min;
        long ways;

        if (diff == 0) {
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = (long) minCount * maxCount;
        }

        System.out.println(diff + " " + ways);
    }
}
