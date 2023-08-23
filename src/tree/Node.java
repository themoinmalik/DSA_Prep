package src.tree;

public class Node {

    int data;

    Node leftNode;
    Node righNode;

    public Node rightNode;


    public Node(int data, Node lefNode, Node righNode) {
        this.data = data;
        this.leftNode = lefNode;
        this.righNode = righNode;
    }
    
}
