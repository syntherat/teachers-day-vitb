import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> passableLevels = new HashSet<>();

        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            passableLevels.add(sc.nextInt());
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            passableLevels.add(sc.nextInt());
        }

        if (passableLevels.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}