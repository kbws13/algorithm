package xyz.kbws.TreeHotProblems.leve2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kbws
 * @date 2024/1/11
 * @description:
 */
public class MaxDepthOfNAryTree {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }else if (root.children.isEmpty()) {
            return 1;
        }else {
            List<Integer> heights = new LinkedList<>();
            for (Node item : root.children) {
                heights.add(maxDepth(item));
            }
            return Collections.max(heights) + 1;
        }
    }
}

class Node{
    public int val;
    public List<Node> children;

    public Node(){}

    public Node(int _val) {
        val = _val;
    }

    public Node (int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}