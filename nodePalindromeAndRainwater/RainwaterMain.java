package nodePalindromeAndRainwater;

public class RainwaterMain {
    public static void main(String[] args) {
        Node head = null;
        head = Node.listInsert(head, new Node(5));
        head = Node.listInsert(head, new Node(1));
        head = Node.listInsert(head, new Node(2));
        head = Node.listInsert(head, new Node(0));
        head = Node.listInsert(head, new Node(0));
        head = Node.listInsert(head, new Node(5));
        head = Node.listInsert(head, new Node(1));
        head = Node.listInsert(head, new Node(2));
        head = Node.listInsert(head, new Node(1));
        head = Node.listInsert(head, new Node(4));
        head = Node.listInsert(head, new Node(1));
        head = Node.listInsert(head, new Node(2));
        head = Node.listInsert(head, new Node(1));
        Node.listPrint(head);

    }

    /**
     * 
     */
    int totalWater(Node head, int maxLeft) {

    }

}
