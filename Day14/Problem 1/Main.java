import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String remixed = scanner.nextLine();

        String original = remixed.replaceAll("(WUB)+", " ").trim();

        System.out.println(original);
    }
}
