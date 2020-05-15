package data_structurs.queue;

import data_structurs.stack.NodeStack;

public class QueueStackImpl {
    // class of queue having two stacks
    public static class Queue {
        NodeStack<Integer> stack;
    }


    /**
     * Function to push an item to stack
     *
     * @param head
     * @param value
     */
    static void push(NodeStack<Integer> head, int value) {
        /* put in the data */
        head.push(value);
    }


    /**
     * Function to pop an item from stack
     *
     * @param head
     * @return element from stack
     */
    static int pop(NodeStack<Integer> head) {
        /*If stack is empty then error */
        if (head == null) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        // return element from stack
        return head.pop();
    }

    /**
     * Function to enqueue an item to queue
     *
     * @param q
     * @param x
     */
    public void enQueue(Queue q, int x) {
        push(q.stack, x);
    }

    /**
     * Function to deQueue an item from queue
     *
     * @param q
     * @return the first inserted element from queue
     */
    public int deQueue(Queue q) {
        int x, res = 0;
        if (q.stack.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }
        else if (q.stack.size() == 1) {
            return pop(q.stack);
        } else {

            x = pop(q.stack);

            res = deQueue(q);

            push(q.stack, x);
            return res;
        }
        return 0;
    }
}