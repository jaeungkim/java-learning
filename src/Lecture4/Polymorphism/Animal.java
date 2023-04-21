package Lecture4.Polymorphism;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }

    //method overriding
    void makeSound(String sound) {
        System.out.println("The animal makes a " + sound + " sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks");
    }

    void makeSound(String sound) {
        System.out.println("The dog barks and makes a " + sound + " sound");
    }
}

