package xyz.kbws.Tree.level2;

import xyz.kbws.Tree.level1.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kbws
 * @date 2024/1/8
 * @description:
 */
public class BottomLeftValue {
    public int findBottomLeftValue(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode temp = new TreeNode();

        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.right != null) {
                // 先把右节点加入 queue
                queue.offer(temp.right);
            }
            if (temp.left != null) {
                // 再把左节点加入 queue
                queue.offer(temp.left);
            }
        }
        return temp.val;
    }
}
