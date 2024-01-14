package xyz.kbws.BitreeBisearch.level2;

import xyz.kbws.Tree.level1.TreeNode;

/**
 * @author kbws
 * @date 2024/1/14
 * @description:
 */
public class SearchInBST {

    /**
     * 使用递归
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST1(TreeNode root, int val) {
        if (root == null || val == root.val) return root;
        return val < root.val ? searchBST1(root.left, val) : searchBST1(root.right, val);
    }

    public TreeNode searchBST2(TreeNode root, int val) {
        while (root != null && val != root.val)
            root = val < root.val ? root.left : root.right;
        return root;
    }
}
