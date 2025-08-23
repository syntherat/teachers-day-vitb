import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= n; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String newStr = s.substring(0, i) + c + s.substring(i);
                set.add(newStr);
            }
        }

        System.out.println(set.size());
    }
}
