package data_structurs.linkedList;

public class LinkedListRunner {

    public static void main(String [] args){
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.insertHead(13);
        myList.insertHead(7);
        myList.insertHead(10);
        myList.display();

        myList.insertTail(7);
        myList.display();

        myList.deleteTail();
        myList.display();

        myList.delete(7);
        myList.display();

        myList.insertOrdered(23);
        myList.insertOrdered(67);
        myList.insertOrdered(3);
        myList.display();
    }
}