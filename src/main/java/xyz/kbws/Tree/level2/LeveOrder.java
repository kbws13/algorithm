package xyz.kbws.Tree.level2;

import xyz.kbws.Tree.level1.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kbws
 * @date 2024/1/8
 * @description:
 */
public class LeveOrder {
    public List<List<Integer>> level102Order(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        // 将节点放入队列中，不断遍历队列
        queue.add(root);
        while (queue.size() > 0) {
            // 获取当前队列的长度，也就是当前这一场元素个数
            int size = queue.size();
            ArrayList<Integer> tmp = new ArrayList<>();
            // 将队列中的元素拿出来放到临时list中
            // 如果节点的左右子树不为空，也放入到队列中
            for (int i=0; i < size; i++) {
                TreeNode t = queue.remove();
                tmp.add(t.val);
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            // 如果此时的tmp就是当前层的全部元素，用 List 类型的tmp保存，加入最后结果中
            res.add(tmp);
        }
        return res;
    }
}
