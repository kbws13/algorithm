package xyz.kbws.TreeAndRecurison.level2;

import xyz.kbws.Tree.level1.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kbws
 * @date 2024/1/9
 * @description:
 */
public class TraversalTree {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }
    public void preorder(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}
