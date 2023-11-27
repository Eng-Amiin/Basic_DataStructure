package Queues;

import java.util.Stack;

public class CircularPrint {
    public static void main(String[] args) {
        CircularArrayQ<String> arrayQ = new CircularArrayQ<>();

        arrayQ.enqueue("Mohamed");
        arrayQ.enqueue("Abdirahman");
        arrayQ.enqueue("Abdulahi");
        System.out.println("           ");

        arrayQ.printQ();

        System.out.println("     ");

        System.out.println(arrayQ.lastName());


    }
}
