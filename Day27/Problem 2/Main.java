import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLong();

        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
        for (long x : arr) {
            if (x < min) min = x;
            if (x > max) max = x;
        }

        long diff = max - min;

        long cntMin = 0, cntMax = 0;
        for (long x : arr) {
            if (x == min) cntMin++;
            if (x == max) cntMax++;
        }

        long ways;
        if (diff == 0) {
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = cntMin * cntMax;
        }

        System.out.println(diff + " " + ways);
    }
}
