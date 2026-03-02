import java.util.*;

public class CollectionsTour {
    public static void main(String[] args) {
        
        // 1. ArrayList: The "Go-To" for fast access (Index-based)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        System.out.println("ArrayList (Ordered): " + arrayList);

        // 2. LinkedList: Great for frequent insertions/deletions at the ends
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Zebra");
        linkedList.add("Elephant");
        System.out.println("LinkedList (Doubly-linked): " + linkedList);

        // 3. Stack: The "Last-In, First-Out" (LIFO) classic
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Top");
        System.out.println("Stack (LIFO): Popping " + stack.pop());

        // 4. ArrayDeque: The modern, faster alternative to Stack and Queue
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Head");
        deque.addLast("Tail");
        System.out.println("ArrayDeque (Double-Ended): " + deque);

        // 5. PriorityQueue: The "VIP Lounge" (Natural ordering or custom comparator)
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(30);
        // Smallest element stays at the head (Natural Order)
        System.out.println("PriorityQueue (Polled head): " + pq.poll());

        // 6. HashSet: The "No Duplicates Allowed" zone
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Unique");
        hashSet.add("Unique"); // This won't be added
        hashSet.add("Different");
        System.out.println("HashSet (Unordered, Unique): " + hashSet);


        arrayList.sort(Comparator.naturalOrder());
    }
}