
package com.leetcode.binarytree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root, true);
    }

    private boolean isMirror(TreeNode leftBranch, TreeNode rightBranch, boolean register) {
        if ((leftBranch == null && rightBranch != null)
                || (rightBranch == null && leftBranch != null) || !register) {
            return false;
        }

        if (leftBranch == null && rightBranch == null) {
            return register;
        }
        register &= leftBranch.val == rightBranch.val;

        if ((leftBranch.left == null && leftBranch.right == null)
                && (rightBranch.left == null && rightBranch.right == null)) {
            return register;
        }
        return isMirror(leftBranch.left, rightBranch.right, register)
                && isMirror(leftBranch.right, rightBranch.left, register);
    }
}