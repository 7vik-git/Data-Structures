package linkedlists;

public class Stack {
    LinkedList list = new LinkedList();

    public void push(int data) {
        list.insertAtStart(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        int value = list.getElementAtIndex(0);
        list.removeNode(0);
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getElementAtIndex(0);
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.showLinkedList();
    }
}