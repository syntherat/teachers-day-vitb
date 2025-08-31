import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumUpper = 0, sumLower = 0;
        boolean hasOddPair = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sumUpper += x;
            sumLower += y;
            if ((x % 2 == 0 && y % 2 == 1) || (x % 2 == 1 && y % 2 == 0)) {
                hasOddPair = true;
            }
        }

        if (sumUpper % 2 == 0 && sumLower % 2 == 0) {
            System.out.println(0);
        } else if (sumUpper % 2 == 1 && sumLower % 2 == 1 && hasOddPair) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
