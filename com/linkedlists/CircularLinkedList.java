package linkedlists;

public class CircularLinkedList{
    Node head;
    Node tail;
    public static int count = 0;
    public void insertAtStart(int data){
        Node n = new Node();
        n.data = data;
        if(head==null){
            head = tail = n;
            n.next = tail;
            count++;
        }else{
            tail.next=n;
            n.next=head;
            head=n;
        }
    }
    public void showList(){
        Node n = head;
        while(n!=tail){
            System.out.print(n.data + " ->> ");
            n=n.next;
        }
        System.out.print(n.data);
        n=n.next;
        System.out.println("<<" + n.data + ">>");
    }
}
