import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int totalRotations = 0;
        int currentPos = 0;

        for (char c : name.toCharArray()) {
            int targetPos = c - 'a';

            int clockwise = (targetPos - currentPos + 26) % 26;
            int counterclockwise = (currentPos - targetPos + 26) % 26;

            int minRotations = Math.min(clockwise, counterclockwise);
            totalRotations += minRotations;

            currentPos = targetPos;
        }

        System.out.println(totalRotations);
    }
}