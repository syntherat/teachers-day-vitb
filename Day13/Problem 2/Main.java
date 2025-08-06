import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String players = scanner.nextLine();

        if (players.contains("0000000") || players.contains("1111111")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
