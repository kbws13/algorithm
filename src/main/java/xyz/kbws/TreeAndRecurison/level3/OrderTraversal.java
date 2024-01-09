package xyz.kbws.TreeAndRecurison.level3;

import xyz.kbws.Tree.level1.TreeNode;

import java.util.*;

/**
 * @author kbws
 * @date 2024/1/9
 * @description:
 */
public class OrderTraversal {
    /**
     * 迭代实现前序遍历
     * @param root
     * @return
     */
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;

        while (!stack.isEmpty() || root != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }

    /**
     * 迭代实现中序遍历
     * @param root
     * @return
     */
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

    /**
     * 迭代实现后序遍历
     * @param root
     * @return
     */
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;

        while (!stack.isEmpty() || root != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        Collections.reverse(res);
        return res;
    }
}
