import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[8];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            count[x]++;
        }

        List<String> result = new ArrayList<>();

        while (count[1] > 0) {
            if (count[2] > 0 && count[4] > 0) {
                result.add("1 2 4");
                count[1]--; count[2]--; count[4]--;
            } else if (count[2] > 0 && count[6] > 0) {
                result.add("1 2 6");
                count[1]--; count[2]--; count[6]--;
            } else if (count[3] > 0 && count[6] > 0) {
                result.add("1 3 6");
                count[1]--; count[3]--; count[6]--;
            } else {
                System.out.println(-1);
                return;
            }
        }

        for (int i = 1; i <= 7; i++) {
            if (count[i] != 0) {
                System.out.println(-1);
                return;
            }
        }

        for (String group : result) {
            System.out.println(group);
        }
    }
}
