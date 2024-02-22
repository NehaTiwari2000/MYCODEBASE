package treeTraversal;


import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeCollection {
    static int index = -1;
//    after any recursion call the value should be incremented , do not create a new instance of the same variable .
//    to have a such functionality we need to have it at class level.


    public Node buildTree(Node rootNode, int[] arr) {
        index++;

//        base condition
        if (arr[index] == -1) {
            return null;
        }

        rootNode = new Node(arr[index]);
//        recursive call
        rootNode.left = buildTree(rootNode, arr);
        rootNode.right = buildTree(rootNode, arr);
        return rootNode;
    }


    public void printAllNode(Node root) {
        if (root == null) {
            System.out.print(" null ");
            return;
        }
        System.out.print(root.data + " ");
        printAllNode(root.left);
        printAllNode(root.right);
    }


    public void levelOrderTraversal(Node root) {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        nodeQueue.add(null);
        System.out.println();
        while (!nodeQueue.isEmpty()) {
            Node trackNode = nodeQueue.remove();

            if (trackNode == null) {
                System.out.println();
                if (nodeQueue.isEmpty()) {
                    break;
                } else {
                    nodeQueue.add(null);
                }
            } else {
                System.out.print(trackNode.data + " ");
                if (trackNode.left != null) {
                    nodeQueue.add(trackNode.left);
                }
                if (trackNode.right != null) {
                    nodeQueue.add(trackNode.right);
                }
            }
        }
    }

//    pre-order     :   root left right
//    post-order    :   right left root        post root is printed its child should be printed , as right is right so right will be printed first then left
//    in-order      :   left root right        LCR (LEFT CENTER RIGHT)



    void preOrderTraversal(Node root){
        if(root==null){
            return ;
        }
        System.out.print (root.data +"  ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }



}


class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

public class BinaryTreePreOrder {
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTreeCollection treeCollection = new BinaryTreeCollection();
        Node root = null;

        root = treeCollection.buildTree(root, nodes);

        System.out.println(" root node data is : " + root.data);
        treeCollection.printAllNode(root);

        treeCollection.levelOrderTraversal(root);
        System.out.println("-----------------------------------");
        System.out.print("Pre Order Traversal :: ");
        treeCollection.preOrderTraversal(root);
        System.out.println();
        System.out.println("-----------------------------------");


//        System.out.println("-----------------------------------");
//        System.out.print("Post Order Traversal :: ");
//        treeCollection.preOrderTraversal(root);
//        System.out.println();
//        System.out.println("-----------------------------------");


    }
}
