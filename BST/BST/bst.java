package BST;

public class bst {
    public class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root = null;

    public void Binary_Search_tree(int in[]) {

    }

    private Node Create_tree(int[] in, int lo, int hi) {
        if (hi < lo) {
            return null;
        }
        int mid = (lo + hi) / 2;

        Node node = new Node(in[mid]);
        node.left = Create_tree(in, lo, mid - 1);
        node.right = Create_tree(in, mid + 1, hi);
    }

    private void display(Node node) {
        System.out.println(root.data);
        display(root.left);
        display(root.right);
        System.out.println();
        System.out.println();
    }
}