package Lecture4.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        // Method overloading examples
        myAnimal.makeSound(); // Output: The animal makes a sound
        myAnimal.makeSound("roar"); // Output: The animal makes a roar sound
        myDog.makeSound(); // Output: The dog barks
        myDog.makeSound("howl"); // Output: The dog barks and makes a howl sound

        // Method overriding example
        Animal myAnimal2 = new Dog(); // Polymorphism
        myAnimal2.makeSound(); // Output: The dog barks
        myAnimal2.makeSound("whimper"); // Output: The dog barks and makes a whimper sound
    }
}
