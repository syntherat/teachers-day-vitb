import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        if (w % 2 == 0 && w >= 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}