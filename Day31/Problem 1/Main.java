import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> database = new HashMap<>();

        while (n-- > 0) {
            String name = sc.next();
            if (!database.containsKey(name)) {
                database.put(name, 0);
                System.out.println("OK");
            } else {
                int count = database.get(name) + 1;
                String newName = name + count;

                while (database.containsKey(newName)) {
                    count++;
                    newName = name + count;
                }

                database.put(name, count);
                database.put(newName, 0);
                System.out.println(newName);
            }
        }
    }
}
