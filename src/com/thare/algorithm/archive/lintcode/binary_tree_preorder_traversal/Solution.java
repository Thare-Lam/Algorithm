package com.thare.algorithm.archive.lintcode.binary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (!stack.isEmpty() || root != null) {
            if (root == null) {
                root = stack.pop();
                root = root.right;
            } else {
                result.add(root.val);
                stack.push(root);
                root = root.left;
            }
        }
        return result;
    }
}
