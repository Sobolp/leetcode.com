
package com.leetcode.binarytree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return getNode(IntStream.of(inorder)
                        .boxed()
                        .collect(Collectors.toList())
                , IntStream.of(postorder)
                        .boxed()
                        .collect(Collectors.toList())
        );
    }

    private TreeNode getNode(List<Integer> inorder, List<Integer> postorder) {
        if (inorder.size() == 0 || postorder.size() == 0) {
            return null;
        }

        TreeNode root = new TreeNode(postorder.get(postorder.size() - 1));
        Integer rootIndex = inorder.indexOf(root.val);
        List<Integer> leftInorder = inorder.subList(0, rootIndex);
        List<Integer> rightInorder = inorder.subList(rootIndex + 1, inorder.size());
        List<Integer> leftPostorder = postorder.subList(0, leftInorder.size());
        List<Integer> rightPostorder = postorder.subList(leftPostorder.size(), leftPostorder.size() + rightInorder.size());

        //left subtree
        root.left = getNode(leftInorder, leftPostorder);
        //right subtree
        root.right = getNode(rightInorder, rightPostorder);
        return root;
    }
}