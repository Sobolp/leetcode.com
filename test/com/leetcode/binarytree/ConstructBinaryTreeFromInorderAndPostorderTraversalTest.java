package com.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    ConstructBinaryTreeFromInorderAndPostorderTraversal constructor = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
    TreeNode testTree;

    @Test
    void buildTreeTest() {
        /**
         * Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
         * Output: [3,9,20,null,null,15,7]
         */
        testTree = new TreeNode(3
                    ,new TreeNode(9)
                    ,new TreeNode(20
                        ,new TreeNode(15)
                        ,new TreeNode(7)
                        )
                    );
        assertEquals(testTree, constructor.buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3}));
    }
}