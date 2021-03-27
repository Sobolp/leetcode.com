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
        ,IntStream.of(postorder)
                        .boxed()
                        .collect(Collectors.toList())
        ,new TreeNode(postorder[postorder.length - 1]));
    }
    private TreeNode getNode (List<Integer> inorder, List<Integer> postorder, TreeNode root){
        Integer index  = postorder.indexOf(root.val) - 1;
        root.left = index < 0 ? null : getNode(inorder, postorder, new TreeNode(inorder.get(index)));
        root.right = index < 0 ? null : getNode(inorder, postorder, new TreeNode(postorder.get(index)));
        return root;
    }

}
