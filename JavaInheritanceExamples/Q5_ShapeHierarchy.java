class Shape {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    double calculateArea() {
        return length * breadth;
    }

    int calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
}

public class Q5_ShapeHierarchy {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        Circle circle = new Circle(7);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());
    }
}