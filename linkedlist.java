public class linkedlist {
    static class Node {
        int data;
        Node next;
        Node prev;  
        Node(int data) {
            this.data = data;
        }
        Node(int data,Node next,Node prev){
            this.data = data;
            this.next=next;
            this.prev=prev;
        }
    }
    static Node createDLL(int[] arr) {
    if (arr.length == 0) return null;
    Node head = new Node(arr[0]);
    Node prevNode = head;
    for (int i = 1; i < arr.length; i++) {
        Node curr = new Node(arr[i]);
        prevNode.next = curr;
        curr.prev = prevNode;
        prevNode = curr;
    }
    return head;
}
static void  insertnode(Node node,int val){
   Node back=node.prev;
   Node newn=new Node(val,node,back);
back.next=newn;
node.prev=newn;
    //return head;
}
  static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
public static void main(String[] args) {
    int[] arr = {12,5,8,7};
    Node head = createDLL(arr);
        insertnode(head.next,13);
        print(head);
    }
}
