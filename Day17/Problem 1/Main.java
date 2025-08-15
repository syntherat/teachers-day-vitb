import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;
        int serejaScore = 0, dimaScore = 0;
        boolean serejaTurn = true;

        while (left <= right) {
            int leftCard = cards[left];
            int rightCard = cards[right];

            if (leftCard >= rightCard) {
                if (serejaTurn) {
                    serejaScore += leftCard;
                } else {
                    dimaScore += leftCard;
                }
                left++;
            } else {
                if (serejaTurn) {
                    serejaScore += rightCard;
                } else {
                    dimaScore += rightCard;
                }
                right--;
            }

            serejaTurn = !serejaTurn;
        }

        System.out.println(serejaScore + " " + dimaScore);
    }
}