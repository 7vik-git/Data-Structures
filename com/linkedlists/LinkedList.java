package linkedlists;

public class LinkedList {
    Node head;
    public void insertAtStart(int data){
        if(head==null){
            Node n = new Node();
            head = n;
            n.data=data;
        }else{
            Node n = new Node();
            n.data=data;
            n.next = head;
            head = n;
        }
    }

    public void insertAtIndex(int data, int index){
        Node n = head;
        Node n1 = new Node();
        n1.data=data;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        n1.next = n.next;
        n.next = n1;
    }

    public void insertAtEnd(int data){
        Node n = head;
        Node n1 = new Node();
        while(n.next!=null){
            n=n.next;
        }
        n1.data=data;
        n.next=n1;
    }

    public int getElementAtIndex(int index){
        Node n = head;
        for(int i=0;i<index;i++){
            n=n.next;
        }
        return n.data;
    }

    public void removeNode(int index){
        Node n = head;
        Node n1 = new Node();
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        n1=n.next;
        n.next=n1.next;
    }

    public void showLinkedList(){
        Node n = head;
        while(n.next!=null){
            System.out.print(n.data + " -> ");
            n=n.next;
        }
        System.out.print(n.data);
        System.out.println();

    }

}
