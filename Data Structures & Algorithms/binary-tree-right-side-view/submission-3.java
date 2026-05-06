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
  
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode rightSide = null;
            int size = queue.size();
            for(int i = 0 ; i < size ; i++) {
                TreeNode curr = queue.poll();
                if(curr != null) {
                    rightSide = curr;
                
                
                    queue.add(curr.left);
                
                
                    queue.add(curr.right);
                }
            }
            if(rightSide != null) {
                list.add(rightSide.val);
            }
            
        }
        return list;

    }

}
