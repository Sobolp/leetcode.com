package com.leetcode.binarytree;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return rootToLeafSum(root, 0, targetSum);
    }

    private boolean rootToLeafSum(TreeNode root, int branchSum, int targetSum) {
        if (root == null) {
            return false;
        }
        branchSum += root.val;
        if (root.left == null && root.right == null) {
            return (branchSum == targetSum);
        }
        return rootToLeafSum(root.left, branchSum, targetSum) ||
                rootToLeafSum(root.right, branchSum, targetSum);
    }
}
