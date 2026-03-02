import java.util.Stack;

public class StackSort {

    public static boolean stackSort(int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int nextExpected = 1; // Start looking for 1

    for (int x : arr) {
        stack.push(x); // Always push the current element first
        
        // While the top of the stack is the number we need next
        while (!stack.isEmpty() && stack.peek() == nextExpected) {
            stack.pop(); // Move it to B (implicitly)
            nextExpected++; // Look for the next number
        }
    }

    // If the stack is empty, we successfully sorted everything
    return stack.isEmpty();
}
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 4, 3 };
        int arr[] = { 1, 3,4,2 };
        if(stackSort(arr))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
