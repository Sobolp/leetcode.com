package com.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    ConstructBinaryTreeFromPreorderAndInorderTraversal constructor = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
    TreeNode testTree;

    @Test
    void buildTreeTest() {
        /**
         * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
         * Output: [3,9,20,null,null,15,7]
         */
        testTree = new TreeNode(3
                    , new TreeNode(9)
                    , new TreeNode(20
                        , new TreeNode(15)
                        , new TreeNode(7)
        )
        );
        assertEquals(TreeNode.getTreeVals(new LinkedList<>(), testTree)
                , TreeNode.getTreeVals(new LinkedList<>()
                        , constructor.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7})));
    }

    }