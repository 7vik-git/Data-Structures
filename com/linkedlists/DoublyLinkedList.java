package linkedlists;

public class DoublyLinkedList {
    DoubleNode head;
    DoubleNode tail;
    static int size = 0;

    public void removeNode(int index){
        DoubleNode n = head;
        DoubleNode n1 = new DoubleNode();
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        n1 = n.next;
        n1=n1.next;
        n.next=n1;
        n1.previous=n;
    }

    public void insertAtStart(int data){
        DoubleNode n = new DoubleNode();
        n.data=data;
        if(head==null){
            head=n;
            tail=n;
            size++;
        }else{
            n.next=head;
            head.previous = n;
            head=n;
            size++;
        }
    }

    public void insertAtEnd(int data){
        DoubleNode n = new DoubleNode();
        n.data=data;
        tail.next=n;
        n.previous=tail;
        tail=n;
        size++;
    }

    public void insertAtIndex(int data, int index){
        DoubleNode n = head;
        DoubleNode n1 = new DoubleNode();
        n1.data=data;
        for(int i=0;i<index-1;i++){
            n = n.next;
        }
        n1.next = n.next;
        n.next = n1;
        n1.previous = n;
        n = n1.next;
        n.previous=n1;
        size++;
    }
    public void showList(){
        DoubleNode n = head;
        while (n.next!=null){
            System.out.print(n.data + " -> ");
            n=n.next;
        }
        System.out.print (n.data);
    }
    public void showListReverse(){

    }
}
