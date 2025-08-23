import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int cnt7 = n / 7; cnt7 >= 0; cnt7--) {
            int rem = n - 7 * cnt7;
            if (rem >= 0 && rem % 4 == 0) {
                int cnt4 = rem / 4;
                StringBuilder sb = new StringBuilder(cnt4 + cnt7);
                for (int i = 0; i < cnt4; i++) sb.append('4');
                for (int i = 0; i < cnt7; i++) sb.append('7');
                System.out.println(sb.toString());
                return;
            }
        }
        System.out.println(-1);
    }
}
