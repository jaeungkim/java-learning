package Lecture3;

public class Dog {
    private String name;
    private int age;

    public void bark() {
        System.out.println(name + " is barking!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
