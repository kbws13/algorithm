package xyz.kbws.TreeHotProblems.leve2;

import xyz.kbws.Tree.level1.TreeNode;

/**
 * @author kbws
 * @date 2024/1/11
 * @description:
 */
public class BalancedTree {
    public boolean isBalance(TreeNode root) {
        return height(root) >= 0;
    }
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
