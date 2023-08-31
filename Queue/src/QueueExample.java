// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

        import java.util.LinkedList;
import java.util.Queue;

        public class QueueExample {
            public static void main(String[] args) {
                // Create a queue using LinkedList
                Queue<String> queue = new LinkedList<>();

                // Add elements to the queue
                queue.add("Element 1");
                queue.add("Element 2");
                queue.add("Element 3");

                // Print the queue
                System.out.println("Queue: " + queue);

                // Remove and retrieve the head of the queue
                String head = queue.poll();
                System.out.println("Removed head: " + head);

                // Print the updated queue
                System.out.println("Updated Queue: " + queue);

                // Retrieve the head without removing
                String peeked = queue.peek();
                System.out.println("Peeked head: " + peeked);

                // Check if the queue contains a specific element
                boolean containsElement = queue.contains("Element 2");
                System.out.println("Contains Element 2: " + containsElement);
            }
        }

