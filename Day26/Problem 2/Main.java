import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k1 = sc.nextInt();
        Queue<Integer> p1 = new LinkedList<>();
        for (int i = 0; i < k1; i++) p1.add(sc.nextInt());

        int k2 = sc.nextInt();
        Queue<Integer> p2 = new LinkedList<>();
        for (int i = 0; i < k2; i++) p2.add(sc.nextInt());

        Set<String> seen = new HashSet<>();
        int fights = 0;

        while (!p1.isEmpty() && !p2.isEmpty()) {
            String state = p1.toString() + "|" + p2.toString();
            if (seen.contains(state)) {
                System.out.println(-1);
                return;
            }
            seen.add(state);

            int a = p1.poll();
            int b = p2.poll();

            if (a > b) {
                p1.add(b);
                p1.add(a);
            } else {
                p2.add(a);
                p2.add(b);
            }

            fights++;
        }

        if (p1.isEmpty()) System.out.println(fights + " 2");
        else System.out.println(fights + " 1");
    }
}
