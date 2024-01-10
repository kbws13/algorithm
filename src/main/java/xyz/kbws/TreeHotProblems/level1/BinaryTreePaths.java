package xyz.kbws.TreeHotProblems.level1;

import xyz.kbws.Tree.level1.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kbws
 * @date 2024/1/10
 * @description:
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, "", res);
        return res;
    }
    public void dfs(TreeNode root, String path, List<String> res) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            res.add(path + root.val);
            return;
        }
        dfs(root.left, path + root.val + "->", res);
        dfs(root.right, path + root.val + "->", res);
    }
}
