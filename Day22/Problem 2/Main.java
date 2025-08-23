import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int washes = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                if(m > 0)m--;
                else washes++;
            } else {
                if(k > 0)k--;
                else if (m > 0) m--;
                else washes++;
            }
        }

        System.out.println(washes);
    }
}