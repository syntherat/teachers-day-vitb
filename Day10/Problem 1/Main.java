import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        int luckyCount = 0;
        for (char digit : number.toCharArray()) {
            if (digit == '4' || digit == '7') {
                luckyCount++;
            }
        }

        if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
