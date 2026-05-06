/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int count = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }
    public int dfs(TreeNode root, int maxVal) {
        if(root == null) {
            return 0;
        }
        if(root.val >= maxVal) {
            count++;
        }
        dfs(root.left, Math.max(root.val, maxVal));
        dfs(root.right, Math.max(root.val, maxVal));
        return count;
    }
}
