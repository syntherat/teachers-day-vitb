import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1);

        System.out.println(capitalized);
    }
}