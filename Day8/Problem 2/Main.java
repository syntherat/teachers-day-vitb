import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0, col = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = scanner.nextInt();
                if (val == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        int moves = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(moves);

        scanner.close();
    }
}
