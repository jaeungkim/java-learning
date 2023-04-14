package Lecture2.Homework;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "password";
        String userInput;

        do {
            System.out.print("Enter the password: ");
            userInput = input.nextLine();
        } while (!userInput.equals(password));

        System.out.println("Access granted!");
    }
}
