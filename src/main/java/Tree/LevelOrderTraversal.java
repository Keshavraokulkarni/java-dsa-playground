package Tree;

import java.util.LinkedList;
import java.util.Queue;

class LevelOrderTraversalNode {
    int data;
    LevelOrderTraversalNode left,right;

    public LevelOrderTraversalNode(int data) {
        this.data = data;
        left = right = null;
    }
}


public class LevelOrderTraversal {



    LevelOrderTraversalNode root;

    public void levelOrderTreeTraversal(LevelOrderTraversalNode node) {
        if(root == null) {
            return;
        }
        Queue<LevelOrderTraversalNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            LevelOrderTraversalNode currentNode = queue.poll();
            System.out.print(currentNode.data +" ");

            if(currentNode.left !=null) {
                queue.add(currentNode.left);
            }

            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.root = new LevelOrderTraversalNode(1);
        levelOrderTraversal.root.left = new LevelOrderTraversalNode(2);
        levelOrderTraversal.root.right = new LevelOrderTraversalNode(3);
        levelOrderTraversal.root.left.left = new LevelOrderTraversalNode(4);
        levelOrderTraversal.root.left.right = new LevelOrderTraversalNode(5);
        levelOrderTraversal.root.right.left = new LevelOrderTraversalNode(6);
        levelOrderTraversal.root.right.right = new LevelOrderTraversalNode(7);

        levelOrderTraversal.levelOrderTreeTraversal(levelOrderTraversal.root);
    }
}
