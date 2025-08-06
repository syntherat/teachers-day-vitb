import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String stones = scanner.next();
        int removals = 0;

        for (int i = 1; i < n; i++) {
            if (stones.charAt(i) == stones.charAt(i - 1)) {
                removals++;
            }
        }

        System.out.println(removals);
    }
}
