package Lecture3;

public class AccessModifiers {
    private String name;
    protected int age;
    double gpa;
    public String major;

    public AccessModifiers(String name, int age, double gpa, String major) { //constructor
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
    }

    public String getName() {
        return name;
    }
}
