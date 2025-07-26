import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for(String i : strs) {
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (group.containsKey(sortedWord)) {
                group.get(sortedWord).add(i);
            } else {
                ArrayList<String> anagramList = new ArrayList<String>();
                anagramList.add(i);
                group.put(sortedWord, anagramList);
            }
        }

        return new ArrayList<>(group.values());
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(sol.groupAnagrams(strs));
    }
}