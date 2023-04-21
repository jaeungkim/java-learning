package Lecture4.Inheritance;

public class Main {
    public static void main (String[] args){
        Dog myDog = new Dog();
        Animal newAnimal = new Animal();

        myDog.eat(); // Inherited method from Animal class
        myDog.bark(); // Method of Dog class

        newAnimal.move();
        myDog.move();

        myDog.eatFromSuper(); //Super method call
    }
}
