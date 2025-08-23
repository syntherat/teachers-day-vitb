import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int length = n.length();
        int index = 0;

        for (int i = 1; i < length; i++) {
            index += (1 << i);
        }

        for (int i = 0; i < length; i++) {
            index <<= 1;
            if (n.charAt(i) == '7') {
                index += 1;
            }
        }

        System.out.println(index + 1);
    }
}
