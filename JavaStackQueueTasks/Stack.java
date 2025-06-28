public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top < capacity - 1) {
            stack[++top] = element;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
