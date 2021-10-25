package com.github.mathan26.ds.algorithms;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        return merge(root1, root2);

    }

    public TreeNode merge(TreeNode t1, TreeNode t2){
        // base conditions
        if(t1 == null && t2 == null)
            return null;

        if(t1 == null && t2 != null)
            return t2;

        if(t1 != null && t2 == null)
            return t1;

        // creating new node
        TreeNode sum = new TreeNode(t1.val + t2.val);

        //recursive call for both left and right
        sum.left = merge(t1.left, t2.left);
        sum.right = merge(t1.right, t2.right);

        return sum;
    }

    private class TreeNode {
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
}
