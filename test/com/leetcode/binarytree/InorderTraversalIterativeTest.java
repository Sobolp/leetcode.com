package com.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InorderTraversalIterativeTest {
    InorderTraversalIterative inorderTraversalIterative = new InorderTraversalIterative();
    TreeNode testTree;
    @Test
    void inorderTraversalTest() {
        // [1,2]
        testTree = new TreeNode(1, new TreeNode(2), null);
        assertEquals(Arrays.asList(2,1), inorderTraversalIterative.inorderTraversal(testTree));

        // [1, null, 2, 3]
        testTree = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertEquals(Arrays.asList (1,3,2),  inorderTraversalIterative.inorderTraversal(testTree));

    }
}