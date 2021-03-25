package com.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> levelQueue = new ArrayDeque<>();
            levelQueue.addAll(queue);
            queue.clear();
            List<Integer> levelList = new ArrayList<>();
            while (!levelQueue.isEmpty()) {
                TreeNode currentNode = levelQueue.poll();
                levelList.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            result.add(levelList);
        }

        return result;
    }
}
