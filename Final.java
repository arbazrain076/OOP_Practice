// // 1. Circle class
// class Circle {
//     private double radius;

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public double getArea() {
//         return Math.PI * radius * radius;
//     }

//     public double getCircumference() {
//         return 2 * Math.PI * radius;
//     }
// }

// // 2. Simple Interest class
// class SimpleInterest {
//     private double principal;
//     private double time;
//     private double rate;

//     public void setPrincipal(double principal) {
//         this.principal = principal;
//     }

//     public void setTime(double time) {
//         this.time = time;
//     }

//     public void setRate(double rate) {
//         this.rate = rate;
//     }

//     public double calculateInterest() {
//         return (principal * time * rate) / 100;
//     }

//     public void printValues() {
//         System.out.println("Principal: " + principal);
//         System.out.println("Time: " + time);
//         System.out.println("Rate: " + rate);
//     }
// }

// // 3. Dog class
// class Dog {
//     private String name;
//     private String breed;

//     public Dog(String name, String breed) {
//         this.name = name;
//         this.breed = breed;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setBreed(String breed) {
//         this.breed = breed;
//     }

//     public void printInfo() {
//         System.out.println("Name: " + name + ", Breed: " + breed);
//     }
// }

// // 4. Employee class
// class Employee {
//     private String name;
//     private String jobTitle;
//     private double salary;

//     public Employee(String name, String jobTitle, double salary) {
//         this.name = name;
//         this.jobTitle = jobTitle;
//         this.salary = salary;
//     }

//     public void updateSalary(double amount) {
//         this.salary += amount;
//     }

//     public double getSalary() {
//         return salary;
//     }
// }

// // ENCAPSULATION

// // 1. Product class
// class Product {
//     private String productName;
//     private int productId;
//     private double price;
//     private int stock;

//     public String getProductName() {
//         return productName;
//     }

//     public void setProductName(String productName) {
//         this.productName = productName;
//     }

//     public int getProductId() {
//         return productId;
//     }

//     public void setProductId(int productId) {
//         this.productId = productId;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         if (price >= 0) this.price = price;
//     }

//     public void purchase(int quantity) {
//         if (stock >= quantity) stock -= quantity;
//     }

//     public void restock(int quantity) {
//         stock += quantity;
//     }
// }

// // 2. BankAccount class
// class BankAccount {
//     private String accountNumber;
//     private String accountHolder;
//     private double balance;

//     public BankAccount(String accountNumber, String accountHolder) {
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = 0;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//     }

//     public void withdraw(double amount) {
//         if (balance >= amount) balance -= amount;
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// // 3. Book class
// class Book {
//     private String title;
//     private String author;
//     private int publicationYear;
//     private boolean isAvailable = true;

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public void setAuthor(String author) {
//         this.author = author;
//     }

//     public int getPublicationYear() {
//         return publicationYear;
//     }

//     public void setPublicationYear(int year) {
//         this.publicationYear = year;
//     }

//     public void borrowBook() {
//         if (isAvailable) isAvailable = false;
//     }
// }

// // 4. Student class
// class Student {
//     private String name;
//     private String idNumber;
//     private final double gpa;

//     public Student(String name, String idNumber, double gpa) {
//         this.name = name;
//         this.idNumber = idNumber;
//         this.gpa = gpa;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getIdNumber() {
//         return idNumber;
//     }

//     public void setIdNumber(String idNumber) {
//         this.idNumber = idNumber;
//     }

//     public double getGpa() {
//         return gpa;
//     }
// }

// // 5. Employee class (encapsulation)
// class EncapsulatedEmployee {
//     private String name;
//     private int employeeId;
//     private double salary;

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getEmployeeId() {
//         return employeeId;
//     }

//     public void setEmployeeId(int employeeId) {
//         this.employeeId = employeeId;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public void updateSalary(double amount) {
//         if (salary + amount >= 0) this.salary += amount;
//     }
// }

// 6. Car class
class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable = true;

    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double price) {
        this.rentalPricePerDay = price;
    }

    public void rentCar() {
        if (isAvailable) isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }
}
