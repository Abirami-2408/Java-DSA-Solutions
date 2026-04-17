public class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    // Print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }  
   static Node insertbefore(Node head,int el,int val){
    if(head==null) return null;
    if(head.data==val){
        Node x=new Node(el);
        x.next=head;
        return x;
    }
    Node temp=head;
    while(temp.next!=null && temp.next.data!=val){
         temp=temp.next;
    }
    if(temp.next==null) return head;
            Node x=new Node(el);
            x.next=temp.next;
            temp.next=x;
            return head;
    }
   
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.print("Original List: ");
        printList(head);
        head=insertbefore(head,37,40);
        printList(head);
    }
}
