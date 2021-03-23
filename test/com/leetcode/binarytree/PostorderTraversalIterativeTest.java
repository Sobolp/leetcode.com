package com.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PostorderTraversalIterativeTest {

    PostorderTraversalIterative postorderTraversalIterative = new PostorderTraversalIterative();
    TreeNode testTree;

    @Test
    void postorderTraversalTest() {
        // [1,2]
        testTree = new TreeNode(1, new TreeNode(2), null);
        assertEquals(Arrays.asList(2,1), postorderTraversalIterative.postorderTraversal(testTree));

        // [1, null, 2, 3]
        testTree = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertEquals(Arrays.asList(3,2,1), postorderTraversalIterative.postorderTraversal(testTree));

    }
}