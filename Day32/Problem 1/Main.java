import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cubes = new int[n];

        for (int i = 0; i < n; i++) {
            cubes[i] = sc.nextInt();
        }

        Arrays.sort(cubes);

        for (int i = 0; i < n; i++) {
            System.out.print(cubes[i] + " ");
        }
    }
}
