package data_structurs.stack;

public class NodeStackTest {

    /**
     * Entry point for the program.
     */
    public static void main(String[] args) {
        NodeStack<Integer> stack = new NodeStack<Integer>();

        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Testing :");
        stack.print();  			// prints : 5 4 3

        Integer x = stack.pop(); 	// x = 5
        stack.push(1);
        stack.push(8);
        Integer y = stack.peek();	// y = 8
        System.out.println("Testing :");
        stack.print();				// prints : 8 1 4 3

        System.out.println("Testing :");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
