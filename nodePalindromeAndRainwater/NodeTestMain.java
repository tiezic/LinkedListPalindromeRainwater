package nodePalindromeAndRainwater;

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
            System.out.println(Node.listSearch(head, 2).key + " was found");
        } else {
            System.out.println("Node was not found");
        }

        if (Node.listSearch(head, 1) != null) {
            System.out.println(Node.listSearch(head, 1).key + " was found");
        } else {
            System.out.println("Node was not found");
        }

        //5. delete a node (node 3)
        System.out.print("Let's delete 3: ");
        head = Node.listDelete(head, head.next.next);

        //6. print list to show deletion
        Node.listPrint(head);

    }
}


