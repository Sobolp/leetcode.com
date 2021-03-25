package com.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTraversalTest {

    LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
    TreeNode testTree;

    @Test
    void levelOrderTest() {
        /**
         * Input: root = [3,9,20,null,null,15,7]
         * Output: [[3],[9,20],[15,7]]
         */
        testTree = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(Arrays.asList(Arrays.asList(3),Arrays.asList(9,20), Arrays.asList(15,7)), levelOrderTraversal.levelOrder(testTree));

        /**
         * Input: root = []
         * Output: []
         */
        testTree = null;
        assertEquals(new ArrayList<>(), levelOrderTraversal.levelOrder(testTree));
    }
}