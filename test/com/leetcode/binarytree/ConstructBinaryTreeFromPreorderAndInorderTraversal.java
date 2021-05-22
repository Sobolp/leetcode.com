package com.leetcode.binarytree;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return getNode(IntStream.of(preorder)
                        .boxed()
                        .collect(Collectors.toList())
                , IntStream.of(inorder)
                        .boxed()
                        .collect(Collectors.toList())
        );
    }

    private TreeNode getNode(List<Integer> preorder, List<Integer> inorder) {
        if (preorder.size() == 0 || inorder.size() == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder.get(0));
        int rootIndex = inorder.indexOf(root.val);
        List<Integer> leftInorder = inorder.subList(0, rootIndex);
        List<Integer> rightInorder = inorder.subList(rootIndex + 1, inorder.size());
        List<Integer> leftPreorder = preorder.subList(1, leftInorder.size() + 1);
        List<Integer> rightPreorder = preorder.subList(leftPreorder.size() + 1, leftPreorder.size() + 1 + rightInorder.size());

        //left subtree
        root.left = getNode(leftPreorder, leftInorder);
        //right subtree
        root.right = getNode(rightPreorder, rightInorder);
        return root;
    }
}
