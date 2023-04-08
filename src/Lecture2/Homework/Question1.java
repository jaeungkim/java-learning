package Lecture2.Homework;

public class Question1 {

    public static int[] fibonacci(int n) { //question 1
        int[] sequence = new int[n];
        if (n >= 1) {
            sequence[0] = 0;
        }
        if (n >= 2) {
            sequence[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence;
    }


    public static void main(String[] args) {
        int[] sequence = fibonacci(10);
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}
