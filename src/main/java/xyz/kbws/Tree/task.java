package xyz.kbws.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author kbws
 * @date 2024/1/8
 * @description:
 */
public class task {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) {
                    // 将当前层第一个节点的值放入结果列表
                    res.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }

            }
        }
        return res;
    }
}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
}
