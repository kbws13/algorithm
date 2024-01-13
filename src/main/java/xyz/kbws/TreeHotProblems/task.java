package xyz.kbws.TreeHotProblems;

import xyz.kbws.Tree.level1.TreeNode;

/**
 * @author kbws
 * @date 2024/1/12
 * @description:
 */
public class task {
    public TreeNode removeLeaves(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 处理左右子树
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);

        // 删除叶子节点
        if (root.left == null && root.right == null) {
            return null;
        }

        return root;
    }
}
