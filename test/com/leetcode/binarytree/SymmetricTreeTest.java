package com.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    SymmetricTree symmetricTree = new SymmetricTree();
    TreeNode testTree;
    @Test
    void isSymmetricTest() {
        /**
         * Input: root = [1,2,2,3,4,4,3]
         * Output: true
         */
        testTree = new TreeNode(1
                    , new TreeNode(2
                        ,new TreeNode(3)
                        ,new TreeNode(4)
                        )
                    , new TreeNode(2
                        ,new TreeNode(4)
                        ,new TreeNode(3)
                        )
                    );
        assertTrue(symmetricTree.isSymmetric(testTree));

        /**
         * Input: root = [1,2,2,null,3,null,3]
         * Output: false
         */
        testTree = new TreeNode(1
                    ,new TreeNode(2
                        ,null
                        ,new TreeNode(3)
                        )
                    ,new TreeNode(2
                        ,null
                        ,new TreeNode(3)
                        )
                    );
        assertFalse(symmetricTree.isSymmetric(testTree));

        /**
         * Input: root = [1,2,2,null,3,3]
         * Output: false
         */
        testTree = new TreeNode(1
                    ,new TreeNode(2
                        ,null
                        ,new TreeNode(3)
                        )
                    ,new TreeNode(2
                        ,new TreeNode(3)
                        ,null
                        )
                    );
        assertTrue(symmetricTree.isSymmetric(testTree));

        /**
         * Input: root = [2,3,3,4,5,5,4,null,null,8,9,null,null,9,8]
         * Output: false
         */
        testTree = new TreeNode(2
                    ,new TreeNode(3
                        ,new TreeNode(4)
                        ,new TreeNode(5
                            ,new TreeNode(8)
                            ,new TreeNode(9)
                            )
                        )
                    ,new TreeNode(3
                        ,new TreeNode(5)
                        ,new TreeNode(4
                            ,new TreeNode(9)
                            ,new TreeNode(8)
                            )
                        )
                    );
        assertFalse(symmetricTree.isSymmetric(testTree));
    }


}