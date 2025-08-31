import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // total cards (not used directly)

        int k1 = sc.nextInt();
        Queue<Integer> p1 = new LinkedList<>();
        for (int i = 0; i < k1; i++) {
            p1.add(sc.nextInt());
        }

        int k2 = sc.nextInt();
        Queue<Integer> p2 = new LinkedList<>();
        for (int i = 0; i < k2; i++) {
            p2.add(sc.nextInt());
        }

        Set<String> seenStates = new HashSet<>();
        int moves = 0;

        while (!p1.isEmpty() && !p2.isEmpty()) {
            String state = p1.toString() + "|" + p2.toString();
            if (seenStates.contains(state)) {
                System.out.println(-1);
                return;
            }
            seenStates.add(state);

            int c1 = p1.poll();
            int c2 = p2.poll();

            if (c1 > c2) {
                p1.add(c2);
                p1.add(c1);
            } else {
                p2.add(c1);
                p2.add(c2);
            }

            moves++;
        }

        if (p1.isEmpty()) {
            System.out.println(moves + " 2");
        } else {
            System.out.println(moves + " 1");
        }
    }
}
