class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class CountTreeNodes {

    static int count = 0;

    static void preorder(TreeNode root) {
        if (root != null) {
            count++;
            preorder(root.left);
            preorder(root.right);
        }
    }

    static int countNodes(TreeNode root) {
        count = 0;
        preorder(root);
        return count;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println("Number of Nodes: " + countNodes(root));
    }
}