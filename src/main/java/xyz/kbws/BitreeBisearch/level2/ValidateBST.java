package xyz.kbws.BitreeBisearch.level2;

import xyz.kbws.Tree.level1.TreeNode;

/**
 * @author kbws
 * @date 2024/1/14
 * @description:
 */
public class ValidateBST {
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 如果左子树下某个元素不满足要求，则退出
        if (!isValidBST(root.left)){
            return false;
        }
        // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        // 访问右子树
        return isValidBST(root.right);
    }
}
