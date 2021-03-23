package com.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InorderTraversalIterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root != null) {
            TreeNode currentNode = root;
            while (currentNode != null || !stack.isEmpty()) {
                while (currentNode != null) {
                    stack.addLast(currentNode);
                    currentNode = currentNode.left;
                }
                currentNode = stack.pollLast();
                result.add(currentNode.val);
                currentNode = currentNode.right;

            }
        }
        return result;
    }
}
