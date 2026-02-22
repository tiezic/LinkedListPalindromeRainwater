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
     * I can't get the method down but it should check if
     * the head node is null, then check if the maxLeft is
     * bigger than the head's key/value, then we find the
     * highest point on the right. the water at the node
     * should be the smaller of maxLeft and maxRight and then
     * we subtract whatevers in the water which is the value
     * of the node. we then have to recurse to the next node
     * and repeat
     */

    int totalWater(Node head, int maxLeft) {
        if (head == null) {
            return 0;
        }

        int currentMaxLeft = 0;

        if (maxLeft > head.key) {
            currentMaxLeft = maxLeft;
        } else if (maxLeft < head.key) {
            currentMaxLeft = head.key;
        }

    }

}
