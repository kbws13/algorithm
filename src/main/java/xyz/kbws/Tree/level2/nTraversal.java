package xyz.kbws.Tree.level2;

import xyz.kbws.Tree.level1.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author kbws
 * @date 2024/1/8
 * @description:
 */
public class nTraversal {
    public List<List<Integer>> nLevelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Node> q = new ArrayDeque<>();
        if (root != null) {
            q.addLast(root);
        }
        while (!q.isEmpty()) {
            Deque<Node> next = new ArrayDeque<>();
            List<Integer> level = new ArrayList<>();
            while (!q.isEmpty()) {
                Node cur = q.pollFirst();
                level.add(cur.val);
                for (Node child : cur.children) {
                    if (child != null) {
                        next.add(child);
                    }
                }
            }
            q = next;
            res.add(level);
        }
        return res;
    }
}

class Node{
    public int val;
    public List<Node> children;
}
