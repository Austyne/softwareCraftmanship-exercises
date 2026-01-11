package be.ucll.craft.maxdepth;

public class MaxDepthCalulator {
    public int maxDepthUsingRecursion(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int left = maxDepthUsingRecursion(root.left);
        int right = maxDepthUsingRecursion(root.right);
        return Math.max(left, right) + 1;
    }

    public int maxDepthUsingBFS(TreeNode root) {
        if (root == null) return 0;
        return 1;
    }
}
