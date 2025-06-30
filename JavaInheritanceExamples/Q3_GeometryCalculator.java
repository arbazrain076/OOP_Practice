class Shape {
    int length, breadth, radius;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void calculateArea() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}