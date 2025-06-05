package Tree;

class Node {
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree
{
    Node root;

    public void preOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void postOrder(Node node) {
        if(node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
       /* binaryTree.root.right.left = new Node(6);
        binaryTree.root.right.right = new Node(7); */

        System.out.println("\nPre Order Traversal:");
        binaryTree.preOrder(binaryTree.root);

        System.out.println("\nIn Order Traversal:");
        binaryTree.inOrder(binaryTree.root);

        System.out.println("\nPost Order Traversal:");
        binaryTree.postOrder(binaryTree.root);
    }

}
