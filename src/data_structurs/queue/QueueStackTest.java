package data_structurs.queue;

import data_structurs.stack.NodeStack;


public class QueueStackTest {

    public static void main(String[] args) {
        /* Create a queue with items 1 2 3*/
        QueueStackImpl.Queue q = new QueueStackImpl.Queue();
        QueueStackImpl queue = new QueueStackImpl();
        q.stack = new NodeStack<>();

        queue.enQueue(q, 1);
        queue.enQueue(q, 2);
        queue.enQueue(q, 3);

        /* Dequeue items */
        System.out.print(queue.deQueue(q) + " ");
        System.out.print(queue.deQueue(q) + " ");
        System.out.print(queue.deQueue(q) + " ");
    }
}
