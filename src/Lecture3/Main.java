package Lecture3;

public class Main {

    public static void main(String[] args){
        Vehicle mercedes = new Vehicle("asdf",1231);

        String mercedesName = mercedes.getName();
        int mercedesYear = mercedes.getYear();

        System.out.println(mercedesYear);
    }
}
