package data_structurs.arrayList;

public class StackTest {
    public static void main(String[] args) {
        Stack customStack = new Stack();

        customStack.push(10);
        customStack.push(3);
        customStack.push(84);
        customStack.push(15.6);
        customStack.push('c');
        customStack.push("Abc");
        customStack.push(10.5f);

        System.out.println("*********************Stack Implementation*********************");
        System.out.println(customStack.isEmpty());
        System.out.println(customStack.peek());
        System.out.println(customStack.pop());
        System.out.println(customStack.peek());
    }

}
