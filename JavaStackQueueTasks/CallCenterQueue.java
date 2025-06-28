import java.util.Scanner;

public class CallCenterQueue {
    private String[] calls;
    private int front, rear, size, capacity;

    public CallCenterQueue(int capacity) {
        this.capacity = capacity;
        calls = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCall(String call) {
        if (size < capacity) {
            rear = (rear + 1) % capacity;
            calls[rear] = call;
            size++;
        } else {
            System.out.println("Call queue is full");
        }
    }

    public void serveCall() {
        if (size > 0) {
            System.out.println("Handling call: " + calls[front]);
            front = (front + 1) % capacity;
            size--;
        } else {
            System.out.println("No calls to handle");
        }
    }

    public void displayQueue() {
        if (size == 0) {
            System.out.println("Call queue is empty");
            return;
        }
        System.out.print("Current Calls: ");
        for (int i = 0; i < size; i++) {
            System.out.print(calls[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public void displayCallCount() {
        System.out.println("Number of pending calls: " + size);
    }

    public static void main(String[] args) {
        CallCenterQueue queue = new CallCenterQueue(5);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Call\n2. Serve Call\n3. Display Queue\n4. Display Count\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter call description: ");
                    String call = scanner.nextLine();
                    queue.addCall(call);
                    break;
                case 2:
                    queue.serveCall();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    queue.displayCallCount();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
