import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String word = sc.next();

            if (word.length() > 10) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                int middleCount = word.length() - 2;

                System.out.println(first + "" + middleCount + last);
            } else {
                System.out.println(word);
            }
        }

        sc.close();
    }
}