class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        System.out.println("Test 1: " + solution.maxDepth(root1)); // Expected: 3

        // Test Case 2: [1,null,2]
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        System.out.println("Test 2: " + solution.maxDepth(root2)); // Expected: 2

        // Test Case 3: Empty tree
        System.out.println("Test 3: " + solution.maxDepth(null)); // Expected: 0
    }
}