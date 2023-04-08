package Lecture3;
public class Methods {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.setName("Rufus");
        myDog.setAge(3);

        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        myDog.bark();

        System.out.println("");

        Dog secondDog = new Dog();
        secondDog.setName("John");
        secondDog.setAge(10);

        System.out.println("");

        System.out.println(secondDog.getName());
        System.out.println(secondDog.getAge());
        secondDog.bark();

        System.out.println("");

        //static check
        C1 referencec1 = new C1();

        referencec1.static_static();
        referencec1.static_instance();
        referencec1.instance_static();
        referencec1.instance_instance();


        C1.static_static();
        C1.static_instance();
//        C1.instance_static();
//        C1.instance_instance();
    }
}
