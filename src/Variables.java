import java.rmi.server.LogStream;

public class Variables {
    public static void main(String[] args) {
        char name = 'k';
        char name2 = 'i';
        String firstname = "kiwoon";

        System.out.println(name);
        System.out.println(firstname);
        System.out.println(firstname + name2);
        System.out.println((firstname + name2) instanceof String);

        int [] inArray = {1,2,3,4,5};
        String [] stringArray = {"hello", "hello2"};

        System.out.println(inArray[0]);
        System.out.println(stringArray[0]);

        for (int i = 0; i < inArray.length; i++) {
            System.out.println(inArray[i]);
        }
    }
}
