import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long rem = a % b;
            if (rem == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - rem);
            }
        }
    }
}
