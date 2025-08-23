import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int pos = 1;
            for (int j = 0; j < n; j++) {
                if (ratings[j] > ratings[i]) {
                    pos++;
                }
            }
            result[i] = pos;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
