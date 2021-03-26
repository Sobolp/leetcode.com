package com.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    PathSum pathSum = new PathSum();
    TreeNode testTree;

    @Test
    void hasPathSumTest() {
        /**
         * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
         * Output: true
         */
        testTree = new TreeNode(5
                , new TreeNode(4
                    , new TreeNode(11
                        , new TreeNode(7)
                        , new TreeNode(2))
                    , null)
                , new TreeNode(8
                    , new TreeNode(13)
                    , new TreeNode(4
                        ,null
                        ,new TreeNode(1))
                    )
                );
        assertTrue(pathSum.hasPathSum(testTree, 22));
    }
}