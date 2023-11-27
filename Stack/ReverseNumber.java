package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {

    Stack<Integer> stack = new Stack<>();
    public void push_digits(int number) {
        while (number != 0) {
            int num = number % 10;
            stack.push(num);
            number = number / 10;
//
        }

    }
        int reverse_number(int num){

            push_digits(num);
            int reversed = 0;
            int i = 1;
            while (!stack.isEmpty()){
                reversed = reversed + (stack.pop() * i);
                i = i * 10;

            }


            return reversed;

    }


    public static void main(String[] args) {

        ReverseNumber reverse = new ReverseNumber();

        System.out.println("Before Is 321");
        int revre= reverse.reverse_number(321);
        System.out.println("After is " + revre);

    }





//    With Use variables To Check Remainder




}
