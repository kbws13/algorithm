package xyz.kbws.TreeHotProblems.leve2;

import xyz.kbws.Tree.level1.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kbws
 * @date 2024/1/10
 * @description:
 */
public class DepthOfBinaryTree {
    /**
     * 后序遍历
     * @param root
     * @return
     */
    public int maxDepth1(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = maxDepth1(root.left);
        int rightHeight = maxDepth1(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    /**
     * 层序遍历
     * @param root
     * @return
     */
    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            //size表示某一层的所有元素数
            int size = queue.size();
            //size=0 表示一层访问完了
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}
