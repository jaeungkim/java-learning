package Lecture4.Inheritance;

class Animal {
    void eat() {
        System.out.println("I can eat");
    }

    //Method Overloading (Compile Time Polymorphism)
    void move() {
        System.out.println("Animal can move");
    }


}

class Dog extends Animal {
    void bark() {
        System.out.println("I can bark");
    }

    void move() {
        System.out.println("Dogs can run and walk");
    }

    void eatFromSuper() {
        super.eat(); // Calls the eat() method of the superclass
    }

}