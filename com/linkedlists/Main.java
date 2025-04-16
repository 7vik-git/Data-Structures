package linkedlists;

public class Main {
    public static void main(String[] args) {
//        LinkedList list1 = new LinkedList();
//        list1.insertAtStart(8);
////        list1.showLinkedList();
//        list1.insertAtStart(12);
//        list1.insertAtStart(5);
//        list1.insertAtStart(17);
//        list1.insertAtStart(3);
//        list1.insertAtStart(6);
//        list1.insertAtIndex(2, 2);
//        list1.showLinkedList();
//        list1.insertAtEnd(15);
//        list1.removeNode(2);
//        list1.showLinkedList();
//        int x =list1.getElementAtIndex(4);
//        System.out.println(x);
//
////        stack
//        Stack stack = new Stack();
//        stack.push(100);
//        stack.push(200);
//        stack.push(300);
//        stack.display();

//        DoublyLinkedList linkedList = new DoublyLinkedList();
//        linkedList.insertAtStart(8);
//        linkedList.insertAtStart(12);
//        linkedList.insertAtStart(45);
//        linkedList.insertAtEnd(99);
//        linkedList.insertAtIndex(28,2);
//        linkedList.removeNode(2);
//        linkedList.showList();
//       System.out.println(linkedList.size);
//
//        MovieManagement newRecord = new MovieManagement();
//        newRecord.insertAtStart("Inception", "Christopher Nolan", 2010, 9);
//        newRecord.insertAtStart("Parasite", "Bong Joon-ho", 2019, 10);
//        newRecord.insertAtStart("The Godfather", "Francis Ford Coppola", 1972, 10);
//        newRecord.insertAtStart("Interstellar", "Christopher Nolan", 2014, 8);
//        newRecord.insertAtStart("Spirited Away", "Hayao Miyazaki", 2001, 9);
//        newRecord.insertAtEnd("Inception", "Christopher Nolan", 2010, 9);
//        newRecord.showMovies();
////        newRecord.showMoviesInReverse();
//        newRecord.searchMovieDetails("Parasite");
//        System.out.println(MovieManagement.movieCount);

        CircularLinkedList ll = new CircularLinkedList();
        ll.insertAtStart(9);
        ll.insertAtStart(12);
        ll.insertAtStart(6);
        ll.insertAtStart(19);
        ll.showList();

    }
}
