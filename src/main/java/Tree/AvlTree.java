package Tree;

class AvlNode {
    int data,height;
    AvlNode left,right;

    public AvlNode(int data) {
        this.data = data;
        this.height = 1;
        left = right = null;
    }
}
public class AvlTree {
    private AvlNode root;

    private int height(AvlNode node) {
        if(node == null) {
            return 0;
        }
        return node.height;
    }

    private int getBalanceFactor(AvlNode node) {
        if(node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    private AvlNode rightRotate(AvlNode y) {
        AvlNode x = y.left;
        AvlNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        //return new root
        return x;
    }

    private AvlNode leftRotate(AvlNode x) {
        AvlNode y = x.right;
        AvlNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left) , height(x.right)) + 1;
        y.height = Math.max(height(y.left) , height(y.right)) + 1;

        // Return new root
        return y;
    }

    public AvlNode insert(AvlNode node,int data) {

        if(node == null) {
            return new AvlNode(data);
        }

        if(data < node.data) {
            node.left = insert(node.left,data);
        } else if (data > node.data) {
            node.right = insert(node.right,data);
        } else {
            return node;
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;

        int balance = getBalanceFactor(node);

        if(balance > 1 && data < node.left.data) {
            return rightRotate(node);
        }

        if(balance < -1 && data > node.right.data) {
            return leftRotate(node);
        }

        if(balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if(balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    public void inOrder(AvlNode node) {
        if(node != null) {
            inOrder(node.left);
            System.out.print(node.data +" ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AvlTree tree = new AvlTree();
        tree.root = tree.insert(tree.root,10);
        tree.root = tree.insert(tree.root,20);
        tree.root = tree.insert(tree.root,30);
        tree.root = tree.insert(tree.root,40);
        tree.root = tree.insert(tree.root,50);
        tree.root = tree.insert(tree.root,25);

        System.out.println("In order traversal of the AVL Tree:");
        tree.inOrder(tree.root);

    }







}
