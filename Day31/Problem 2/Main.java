import java.util.*;

public class Main {
    static class Segment implements Comparable<Segment> {
        int left, right, length;

        Segment(int left, int right) {
            this.left = left;
            this.right = right;
            this.length = right - left + 1;
        }

        @Override
        public int compareTo(Segment other) {
            if (this.length != other.length) {
                return other.length - this.length;
            }
            return this.left - other.left;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] ans = new int[n + 1];

            PriorityQueue<Segment> pq = new PriorityQueue<>();
            pq.add(new Segment(1, n));
            int value = 1;

            while (!pq.isEmpty()) {
                Segment seg = pq.poll();
                int l = seg.left;
                int r = seg.right;
                int mid = (l + r) / 2;

                ans[mid] = value++;

                if (l <= mid - 1) {
                    pq.add(new Segment(l, mid - 1));
                }
                if (mid + 1 <= r) {
                    pq.add(new Segment(mid + 1, r));
                }
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
