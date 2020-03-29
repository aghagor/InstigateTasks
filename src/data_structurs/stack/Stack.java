package data_structurs.stack;

public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

    private Object[] storage;

    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        this.storage = new Object[capacity];
        this.tos = -1;
    }

    public void push(Object value) {
        if (tos == storage.length - 1) {
            extendStorage();
        }
        storage[++tos] = value;
    }

    public Object peek() {
        if (!isEmpty()) {
            return storage[tos];
        } else {
            System.out.println("The stack is empty, can't peek");
            return -1;
        }
    }

    public Object pop() {
        return tos < 0 ? -1 : storage[tos--];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    private void extendStorage() {
        Object[] newStorage = new Object[storage.length + 1];
        for (int i = 0; i < storage.length; i++) {
            newStorage[i] = storage[i];
        }
        storage = newStorage;
    }
}
