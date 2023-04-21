package Lecture3.Homework;

public class Main {
    public static void main(String[] args) {
        // Basic Calculator
        Calculator calculator = new Calculator();
        System.out.println("Add: " + calculator.add(3, 4));
        System.out.println("Subtract: " + calculator.subtract(9, 4));
        System.out.println("Multiply (static): " + Calculator.multiply(3, 4));
        System.out.println("Divide (static): " + Calculator.divide(12, 4));

        System.out.println("------------------------------");

        // Circle and Geometry Utility
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Circumference: " + circle.circumference());
        System.out.println("Circle Area (static): " + GeometryUtility.circleArea(5));
        System.out.println("Circle Circumference (static): " + GeometryUtility.circleCircumference(5));

        System.out.println("------------------------------");

        // Student Grades
        int[] grades1 = {90, 85, 70, 95};
        int[] grades2 = {80, 95, 88, 78};
        Student student1 = new Student("Alice", grades1);
        Student student2 = new Student("Bob", grades2);
        System.out.println("Student1 Average: " + student1.averageGrade());
        System.out.println("Student2 Average: " + student2.averageGrade());
        System.out.println("Higher Average: " + Student.getHigherAverage(student1, student2).averageGrade());

        System.out.println("------------------------------");

        // Temperature Conversion
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("Celsius to Fahrenheit: " + converter.celsiusToFahrenheit(30));
        System.out.println("Fahrenheit to Celsius: " + converter.fahrenheitToCelsius(86));
        System.out.println("Celsius to Fahrenheit (static): " + TemperatureConverter.convertCelsiusToFahrenheit(30));
        System.out.println("Fahrenheit to Celsius (static): " + TemperatureConverter.convertFahrenheitToCelsius(86));

        System.out.println("------------------------------");

        // Bank Account
        BankAccount account1 = new BankAccount("John Doe", "123456");
        BankAccount account2 = new BankAccount("Jane Doe", "654321");
        account1.deposit(1000);
        account1.withdraw(200);
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
        BankAccount.transfer(account1, account2, 500);
        System.out.println("Account 1 Balance after transfer: " + account1.getBalance());
        System.out.println("Account 2 Balance after transfer: " + account2.getBalance());
    }
}
