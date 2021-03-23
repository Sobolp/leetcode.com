package com.leetcode.binarytree;

import java.util.*;

public class PreorderTraversalIterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root != null) {
            stack.addLast(root);
            while (!stack.isEmpty()) {
                TreeNode currentNode = stack.pollLast();
                result.add(currentNode.val);
                if (currentNode.right != null) {
                    stack.addLast(currentNode.right);
                }
                if (currentNode.left != null) {
                    stack.addLast(currentNode.left);
                }
            }
        }
        return result;
    }
}
