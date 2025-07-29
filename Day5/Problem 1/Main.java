import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 0; i < intervals.length; i++) {
            int[] current = intervals[i];
            int[] lastMerged = merged.get(merged.size() - 1);

            if (current[0] <= lastMerged[1]) {
                lastMerged[1] = Math.max(lastMerged[1], current[1]);
            } else {
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[][] intervals1 = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] result1 = solution.merge(intervals1);
        System.out.println("Test 1: " + Arrays.deepToString(result1));

        // Test Case 2
        int[][] intervals2 = {{1,4}, {4,5}};
        int[][] result2 = solution.merge(intervals2);
        System.out.println("Test 2: " + Arrays.deepToString(result2));
    }
}