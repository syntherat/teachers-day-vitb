class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test: [4,2,7,1,3,6,9] -> [4,7,2,9,6,3,1]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        sol.invertTree(root);
        System.out.println("Tree inverted successfully");
    }
}