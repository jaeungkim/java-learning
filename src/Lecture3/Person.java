package Lecture3;


//INHERITANCE
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + " and I am " + age + " years old.");
    }

    public static void main(String[] args){
        Student jaeungkim = new Student("JaeungKim",28,4.0,"Computer Science");
        Person jaekim = new Person("jaekim", 28);
        jaeungkim.study();
        jaekim.sayHello();
    }
}

class Student extends Person {
    private double gpa;
    private String major;

    public Student(String name, int age, double gpa, String major) {
        super(name, age);
        this.gpa = gpa;
        this.major = major;
    }

    public void study() {
        System.out.println(name + " is studying " + major + " and has a GPA of " + gpa + ".");
    }
}