public class Main {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] test2 = {1};
        int[] test3 = {5,4,-1,7,8};

        System.out.println(maxSubArray(test1)); // Output: 6
        System.out.println(maxSubArray(test2)); // Output: 1
        System.out.println(maxSubArray(test3)); // Output: 23
    }
}