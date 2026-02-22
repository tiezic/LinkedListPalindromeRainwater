package nodePalindromeAndRainwater;
public class PalindromeMain {
    public static void main(String[] args) {
        Node head = null;

        head = Node.listInsert(head, new Node(1));
        head = Node.listInsert(head, new Node(2));
        head = Node.listInsert(head, new Node(3));
        head = Node.listInsert(head, new Node(2));
        head = Node.listInsert(head, new Node(1));

        if (PalCheck(head, head) != null) {
            System.out.println("linked list is palindrome");
        } else {
            System.out.println("linked list isnt palindrome");
        }
    }

    /**
     * I can't get the method to work, but the method should
     * compare the values of the head and tail nodes and return
     * head's pointer or else return null. then recurse and
     * increment the tail to the next available node. once the
     * method recurses back, if the returned head keys match the
     * tail keys, then return nextHead.next or else return null
     */
    static Node PalCheck(Node head, Node tail) {
        if (tail.next == null) {
            if (head.key == tail.key) {
                return head.next; 
            }
            return null;
        }

        Node currentTail = tail.next;
        Node nextHead = PalCheck(head, currentTail);

        if(nextHead == null) {
            return null;
        }

        if(nextHead.key == tail.key) {
            return nextHead.next;
        }

        return null;
    }
}

