package Lecture3;

//POLYMORPHISM
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
    public static void main(String[] args){
        Animal animal1 = new Animal();
        Duck duck1 = new Duck();
        Cat cat1 = new Cat();

        animal1.makeSound(); // prints "The animal makes a sound."
        duck1.makeSound(); // prints "The Duck yeets."
        cat1.makeSound(); // prints "The cat meows."
    }
}


class Duck extends Animal {
    public void makeSound() {
        System.out.println("The Duck yeets.");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}