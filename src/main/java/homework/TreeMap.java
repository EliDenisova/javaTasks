package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeMap {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1, new TreeNode(null), new TreeNode(2, new TreeNode(), new TreeNode(3)));
        System.out.println(TreeNode.preorderTraversal(tree1));
        TreeNode tree2 = new TreeNode(3, new TreeNode(1, new TreeNode(0), new TreeNode()), new TreeNode(5, new TreeNode(4), new TreeNode(6)));
        System.out.println(TreeNode.preorderTraversal(tree2));
    }
}

class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(Integer val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static ArrayList<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val != null) result.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return result;
    }

}

