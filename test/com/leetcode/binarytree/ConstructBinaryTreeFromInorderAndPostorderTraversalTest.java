package com.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

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
        assertEquals(TreeNode.getTreeVals(new LinkedList<>(), testTree)
                , TreeNode.getTreeVals(new LinkedList<>()
                        , constructor.  buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3})));

        /**
         * Input: inorder = [2,1], postorder = [2,1]
         * Output: [1,2]
         */
        testTree = new TreeNode(1
                    , new TreeNode(2)
                    , null);
        assertEquals(TreeNode.getTreeVals(new LinkedList<>(), testTree)
                , TreeNode.getTreeVals(new LinkedList<>()
                        , constructor.buildTree(new int[]{2,1}, new int[]{2,1})));

        /**
         * Input: inorder = [1, 2], postorder = [2,1]
         * Output: [1, null ,2]
         */
        testTree = new TreeNode(1
                , null
                , new TreeNode(2));
        assertEquals(TreeNode.getTreeVals(new LinkedList<>(), testTree)
                , TreeNode.getTreeVals(new LinkedList<>()
                        , constructor.buildTree(new int[]{1,2}, new int[]{2,1})));

        /**
         * Input: inorder = [2,3,1], postorder = [3,2,1]
         * Output: [1,2,null,null,3]
         */
        testTree = new TreeNode(1
                    ,new TreeNode(2
                        ,null
                        ,new TreeNode(3))
                    ,null);

        assertEquals(TreeNode.getTreeVals(new LinkedList<>(), testTree)
                , TreeNode.getTreeVals(new LinkedList<>()
                        , constructor.buildTree(new int[]{2,3,1}, new int[]{3,2,1})));

        /**
         * Input: inorder = [1,3,2], postorder = [3,2,1]
         * Output: [1,null,2 ,3]
         */
        testTree = new TreeNode(1
                ,null
                ,new TreeNode(2
                    ,new TreeNode(3)
                    ,null));

        assertEquals(TreeNode.getTreeVals(new LinkedList<>(), testTree)
                , TreeNode.getTreeVals(new LinkedList<>()
                        , constructor.buildTree(new int[]{1,3,2}, new int[]{3,2,1})));

        /**
         * Input: inorder = [1,2,3,4], postorder = [2,1,4,3]
         * Output: [1,null,2 ,3]
         */
        testTree = new TreeNode(3
                    ,new TreeNode(1
                        ,null
                        ,new TreeNode(2))
                    ,new TreeNode(4));

        assertEquals(TreeNode.getTreeVals(new LinkedList<>(), testTree)
                , TreeNode.getTreeVals(new LinkedList<>()
                        , constructor.buildTree(new int[]{1,2,3,4}, new int[]{2,1,4,3})));
    }
}