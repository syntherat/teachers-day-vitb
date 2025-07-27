import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> count.get(a) - count.get(b)
        );

        for (int num : count.keySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else {
                int leastFrequent = minHeap.peek();
                if (count.get(num) > count.get(leastFrequent)) {
                    minHeap.poll();
                    minHeap.offer(num);
                }
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] nums1 = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(sol.topKFrequent(nums1, 2)));

        // Test case 2
        int[] nums2 = {1};
        System.out.println(Arrays.toString(sol.topKFrequent(nums2, 1)));
    }
}