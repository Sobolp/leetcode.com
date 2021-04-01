package com.leetcode.binarytree;

import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

/*
    public  static List<Integer> getTreeVals(List<Integer> vals, TreeNode root) {
        vals.add(root.val);
        if (root.left != null) {
            vals = getTreeVals(vals,root.left);
        }
        if (root.right != null) {
            vals = getTreeVals(vals,root.right);
        }

        return vals;
    }
*/

    public static List<String> getTreeVals(List<String> vals, TreeNode root) {
        vals.add(String.valueOf(root.val));
        if (root.left != null) {
            vals = getTreeVals(vals, root.left);
        } else {
            vals.add(null);
        }
        if (root.right != null) {
            vals = getTreeVals(vals, root.right);
        } else {
            vals.add(null);
        }

        return vals;
    }

}