package xyz.kbws.TreeHotProblems.level3;

import xyz.kbws.Tree.level1.TreeNode;

/**
 * @author kbws
 * @date 2024/1/12
 * @description:
 */
public class AncestorOfTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) {
            return null;
        }
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }
}
