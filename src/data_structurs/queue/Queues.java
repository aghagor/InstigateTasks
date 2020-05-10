package data_structurs.queue;

public class Queues {

    public static void main(String args[]) {
        Queue myQueue = new Queue(4);
        myQueue.insert(10);
        myQueue.insert(2);
        myQueue.insert(5);
        myQueue.insert(3);

        System.out.println(myQueue.isFull());

        myQueue.remove();

        myQueue.insert(7);

        System.out.println(myQueue.peekFront());
        System.out.println(myQueue.peekRear());
    }
}