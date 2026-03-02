 class StackArray {

    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to init
    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = value;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    // Check empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack
    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}


public class TestStack {

    
    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); 

        System.out.println(stack.pop());  
        System.out.println(stack.peek()); 

        stack.display(); 
    }
}
