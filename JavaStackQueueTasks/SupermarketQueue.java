import java.util.Scanner;

public class SupermarketQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public SupermarketQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCustomer(String name) {
        if (size < capacity) {
            rear = (rear + 1) % capacity;
            queue[rear] = name;
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public void serveCustomer() {
        if (size > 0) {
            System.out.println("Serving: " + queue[front]);
            front = (front + 1) % capacity;
            size--;
        } else {
            System.out.println("No customers to serve");
        }
    }

    public void displayQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Current Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public void displayCustomerCount() {
        System.out.println("Number of customers: " + size);
    }

    public static void main(String[] args) {
        SupermarketQueue queue = new SupermarketQueue(5);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Customer\n2. Serve Customer\n3. Display Queue\n4. Display Count\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    queue.addCustomer(name);
                    break;
                case 2:
                    queue.serveCustomer();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    queue.displayCustomerCount();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
