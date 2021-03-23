package com.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BinaryTreePreorderTraversalIterativeTest {
    BinaryTreePreorderTraversalIterative binaryTreePreorderTraversalIterative = new BinaryTreePreorderTraversalIterative();
    @Test
    void preorderTraversalTest() {
        // [1, null, 2, 3]
        TreeNode testTree = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertEquals(Arrays.asList (1,2,3),  binaryTreePreorderTraversalIterative.preorderTraversal(testTree));
        // [3,1,2]
        testTree = new TreeNode(3, new TreeNode(1), new TreeNode(2));
        assertEquals(Arrays.asList (3,1,2),  binaryTreePreorderTraversalIterative.preorderTraversal(testTree));
    }
}