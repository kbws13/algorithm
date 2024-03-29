package xyz.kbws.TreeHotProblems.level1;

import xyz.kbws.Tree.level1.TreeNode;

/**
 * @author kbws
 * @date 2024/1/10
 * @description:
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) {
            return root2;
        }
        if(root2 == null) {
            return root1;
        }
        TreeNode merge = new TreeNode(root1.val + root2.val);
        merge.left = mergeTrees(root1.left, root2.left);
        merge.right = mergeTrees(root1.right, root2.right);
        return merge;
    }
}
