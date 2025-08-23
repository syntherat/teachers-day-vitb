import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        boolean removed = false;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (!removed && s.charAt(i) == '0') {
                removed = true;
                continue;
            }
            result.append(s.charAt(i));
        }

        if (!removed) result.deleteCharAt(result.length() - 1);

        System.out.println(result.toString());
    }
}
