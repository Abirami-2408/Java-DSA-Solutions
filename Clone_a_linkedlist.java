class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class  Clone_a_linkedlist {

    // Step 1: Insert copy nodes in between
    public void insertCopyInBetween(Node head) {
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            Node copy = new Node(temp.val);
            temp.next = copy;
            copy.next = next;
            temp = next;
        }
    }

    // Step 2: Assign random pointers
    public void connectRandomPointers(Node head) {
        Node temp = head;

        while (temp != null) {
            Node copy = temp.next;

            if (temp.random != null) {
                copy.random = temp.random.next;
            } else {
                copy.random = null;
            }

            temp = temp.next.next;
        }
    }

    // Step 3: Separate the copied list
    public Node getDeepCopy(Node head) {
        Node temp = head;

        Node dummy = new Node(-1);
        Node res = dummy;

        while (temp != null) {
            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }

        return dummy.next;
    }

    // Main function
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        insertCopyInBetween(head);
        connectRandomPointers(head);
        return getDeepCopy(head);
    }
    public static void main(String args[]) {

    // Create nodes
    Node n1 = new Node(7);
    Node n2 = new Node(13);
    Node n3 = new Node(11);
    Node n4 = new Node(10);
    Node n5 = new Node(1);

    // Connect next pointers
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    // Connect random pointers
    n1.random = null;
    n2.random = n1;
    n3.random = n5;
    n4.random = n3;
    n5.random = n1;

    Clone_a_linkedlist obj = new Clone_a_linkedlist();

    Node copiedHead = obj.copyRandomList(n1);

    // Print copied list
    Node temp = copiedHead;
    while (temp != null) {
        System.out.print("Val: " + temp.val);
        if (temp.random != null)
            System.out.println(", Random: " + temp.random.val);
        else
            System.out.println(", Random: null");
        temp = temp.next;
    }
}
   
}