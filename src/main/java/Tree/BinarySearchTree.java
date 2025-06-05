package Tree;

public class BinarySearchTree {
    TreeNode root;

    class TreeNode {
        int data;
        TreeNode left,right;

        public TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root,key);
    }

    TreeNode insertRec(TreeNode root, int key) {
         if(root == null) {
             root = new TreeNode(key);
             return root;
         }
         if(key < root.data) {
             root.left = insertRec(root.left,key);
         } else if (key > root.data) {
             root.right =  insertRec(root.right,key);
         }
        return root;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(TreeNode root, int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        if(key < root.data) {
            return searchRec(root.left,key);
        }
        return searchRec(root.right,key);
    }

    public void preOrder(TreeNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(20);
        binarySearchTree.insert(15);
        binarySearchTree.insert(50);
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);

        binarySearchTree.preOrder(binarySearchTree.root);

        System.out.println("\nSearch 50:"+binarySearchTree.search(50));
        System.out.println("\nSearch 55:"+binarySearchTree.search(55));
    }


}
