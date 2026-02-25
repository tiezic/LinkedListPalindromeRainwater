package nodePalindromeAndRainwater;
public class PalindromeMain {
    public static void main(String[] args) {
        Node head = null;

        //make palindromic list
        head = Node.listInsert(head, new Node(1));
        head = Node.listInsert(head, new Node(2));
        head = Node.listInsert(head, new Node(3));
        head = Node.listInsert(head, new Node(2));
        head = Node.listInsert(head, new Node(1));

        System.out.println("Check the list if it's a palindrome: ");
        Node.listPrint(head);

        //condition to check for palindrome (can really be
        // implemented into PalCheck though)
        if (PalCheck(head, head) != null) {
            System.out.println("List is palindrome!");
        } else {
            System.out.println("List is NOT palindrome!");
        }
    }

    /**
     * this method will first increment the "tail" node 
     * starting from "head" node until it reaches the 
     * actual last node of the list. then, we recurse
     * back, checking every incremental "head" if their
     * key == "tail's" key. if they all match, the list
     * is a palindrome. if not, it returns null
     */
    static Node PalCheck(Node head, Node tail) {
        //first if
        if (tail.next == null) {
            if (head.key == tail.key) {
                return head.next;
            }
            
            return null;
        }

        Node CurrentTail = tail.next;
        Node NextHead = PalCheck(head, CurrentTail);

        //second if
        if (NextHead == null) {
            return null;
        }

        //third if
        if (NextHead.next == null) {
            return NextHead;
        } else if (NextHead.key == tail.key) {
            return NextHead.next;
        }

        //PalCheck fails
        return null;

    }//end PalCheck
}

