
/**
 * In main, we need to:
 * 1. create an empty list
 * 2. insert three nodes
 * 3. print the list
 * 4. search for a node and print 
 *    if it was found or not
 * 5. delete one node
 * 6. print list to show deletion
 */
public class NodeTestMain {
    public static void main(String[] args) {
        //1. list without nodes; empty list
        Node head = null;

        //2. insert three nodes into list
        head = Node.listInsert(head, new Node(2));
        head = Node.listInsert(head, new Node(3));
        head = Node.listInsert(head, new Node(4));
        head = Node.listInsert(head, new Node(5));


        //3. print list of nodes
        Node.listPrint(head);

        //4. search for node with key = 2
        //   and search for nonexistent node
        if (Node.listSearch(head, 2) != null) {
            System.out.print(Node.listSearch(head, 2) + " was found with key: ");
            System.out.println(Node.listSearch(head, 2).key);
        } else {
            System.out.println("Node was not found");
        }

        if (Node.listSearch(head, 1) != null) {
            System.out.print(Node.listSearch(head, 1) + " was found with key: ");
            System.out.println(Node.listSearch(head, 1).key);
        } else {
            System.out.println("Node was not found");
        }

        //5. delete a node
        head = Node.listDelete(head, head.next.next);

        //6. print list to show deletion
        Node.listPrint(head);

    }
}


/**
 * Node class to create node objects and node 
 * methods such as insert, search, and delete.
 * notice: methods are static so we can just
 * call them in the main method without using
 * an object
 */
class Node {
    int key;
    Node next;

    //constructor for empty node
    Node() {}

    /** 
     * lets make a constructor to create
     * nodes easier (value can be any int
     * but next node must be null until
     * we assign it to the next node)
     */ 
    Node(int key) {
        this.key = key;
        next = null;
    }

    /**
     * listInsert will "Insert node x at 
     * the head and returns the new head".
     */
    static Node listInsert(Node head, Node x) {
        x.next = head;
        return x;
    }

    /**
     * listSearch will "return the node 
     * whose key matches key, or null if 
     * not found".
     */
    static Node listSearch(Node head, int key) {
        Node currentNode = head;

        //while currentNode isnt null, it checks if the 
        // currentNode's value is the one we are looking 
        // for and if so, return the node. if we reach 
        // the end of the list, or a null node, the loop 
        // stops and we return null
        while (currentNode != null) {
            if (currentNode.key == key) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }

        return null;
    }

    /**
     * listDelete will "Delete node x 
     * from the list and return the 
     * (possibly updated) head".
     */
    static Node listDelete(Node head, Node x) {
        //we have to make sure the list is not empty
        if (head == null) {
            return null;
        } 
        
        //return the reference for the next node
        //and in the main method, the head should
        //be assigned the next node so the link to
        //the original head is broken
        if (head == x) {
            return head.next;
        }

        Node currentNode = head;

        while (currentNode.next != x) {
            currentNode = currentNode.next;

            if (currentNode == x) {
                currentNode.next = x.next;
            }
        }

        return head;
    }

    /**
     * i made an extra method to print
     * the values (keys) of each node
     * in the linked list.
     */
    static void listPrint(Node head) {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.key);
            if (currentNode.next != null) {
                System.out.print(" -> ");
            }
            currentNode = currentNode.next;
        }

        //extra line for output
        System.out.print("\n");

    }
}

