package Lecture1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //자바에서는 따옴표가 없는 숫자는 숫자로 인식한다.
        System.out.println(1+2);

        //곱하기를 할 때는 *(에스터리스크, Asterisk, 키보드 자판상으로 숫자 8 위)를 사용한다.
        System.out.println(2*5);

        //나누기를 할 때는 /(슬래쉬, slash, 키보드 자판상으로 오른쪽 shift 키 왼쪽)를 사용한다.
        System.out.println(6/2);

        //자바는 문자(Character)와 문자열(String)을 구분한다. 문자는 한 글자를 의미하고, 문자열은 여러 개의 문자가 결합한 것을 의미한다. 자바에서 문자는 '(작은따옴표)로 감싸야 한다.
        System.out.println('생');

        //문자열은 "(큰따옴표)로 감싸야 한다.
        System.out.println("생활코딩");

        //만약 문자열을 작은 따옴표로 감싸면 에러가 발생한다.
//        System.out.println('생활코딩');

        //하나의 문자를 큰따옴표로 감싼다고 에러가 발생하지는 않는다. 한 글자도 문자열이 될 수 있기 때문이다.
        System.out.println("생");

        //만약 문자열 안에 큰 따옴표를 넣고 싶다면 어떻게 해야 할까?
        System.out.println("Jaewoong said \"Welcome to programming world\"");

        //여러 줄을 표시하고 싶을 때는 아래와 같이 하면 된다.
        System.out.println("HTML\nCSS\nJavaScript\n");

        //문자와 문자를 더할 때는 아래와 같이 한다.
        System.out.println("생활"+"코딩");
    }
}