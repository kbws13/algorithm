package xyz.kbws.TreeHotProblems.leve2;

import xyz.kbws.Tree.level1.TreeNode;

import java.util.LinkedList;

/**
 * @author kbws
 * @date 2024/1/11
 * @description:
 */
public class MinimumDepthOfTree {
    public int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth1(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth1(root.right), min_depth);
        }

        return min_depth + 1;
    }

    public int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minDepth = 0;

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.size() > 0) {
            //获取当前队列的长度，这个长度相当于 当前这一层的节点个数
            int size = queue.size();
            minDepth++;
            for (int i = 0; i < size; ++i) {
                TreeNode t = queue.remove();
                if (t.left == null && t.right == null) {
                    return minDepth;
                }
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
        }
        return 0;
    }
}
