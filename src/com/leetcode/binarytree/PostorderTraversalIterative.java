package com.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostorderTraversalIterative {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode currentNode = root;
        while (true) {
            while (currentNode != null) {
                stack.addLast(currentNode);
                stack.addLast(currentNode);
                currentNode = currentNode.left;
            }
            // Check for empty stack
            if (stack.isEmpty()) {
                break;
            }
            currentNode = stack.pollLast();
            if (!stack.isEmpty() && stack.peekLast() == currentNode) {
                currentNode = currentNode.right;
            }else {
                result.add(currentNode.val);
                currentNode = null;
            }
        }
        return result;
    }
}
