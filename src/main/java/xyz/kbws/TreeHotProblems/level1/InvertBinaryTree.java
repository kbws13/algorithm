package xyz.kbws.TreeHotProblems.level1;

import xyz.kbws.Tree.level1.TreeNode;

import java.util.LinkedList;

/**
 * @author kbws
 * @date 2024/1/10
 * @description:
 */
public class InvertBinaryTree {
    /**
     * 前序遍历
     * @param root
     * @return
     */
    public TreeNode invertTree1(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        invertTree1(root.left);
        invertTree1(root.right);

        return root;
    }

    /**
     * 后序遍历
     * @param root
     * @return
     */
    public TreeNode invertTree2(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode left = invertTree2(root.left);
        TreeNode right = invertTree2(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    /**
     * 层次遍历
     * @param root
     * @return
     */
    public TreeNode invertTree3(TreeNode root) {
        if (root == null) {
            return null;
        }
        //将二叉树中的节点逐层放入队列中，再迭代处理队列中的元素
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            //每次都从队列中拿一个节点，并交换这个节点的左右子树
            TreeNode tmp = queue.poll();
            TreeNode left = tmp.left;
            tmp.left = tmp.right;
            tmp.right = left;
            //如果当前节点的左子树不为空，则放入队列等待后续处理
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            //如果当前节点的右子树不为空，则放入队列等待后续处理
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }

        return root;
    }
}
