package Stack;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

public class ArrayStack<T> {
    private static final int DEFAULT_SIZE = 2;
    private int top;
    private T[] stack;

    public ArrayStack() {
        this(DEFAULT_SIZE);
    }

    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);


    }

    //Methods

    public int Size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public void push(T element) {
        if (Size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;

    }

    public T peek() throws EmptyStackException {

        if (isEmpty())
            throw new EmptyStackException();
        return stack[top - 1];

    }

    public T pop() throws EmptyStackException {

        if (isEmpty())
            throw new EmptyStackException();
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;

    }

    public String toString() {
        return Arrays.toString(stack);
    }

    public String toDisplay() {
        StringBuffer display = new StringBuffer("[ ");

        for (int i = 0; i < stack.length; i++) {
            display.append(stack[i]).append(" , ");
            if (i == stack.length - 1)
                display.append("  ]");


        }


        return display.toString();

    }



//     public  void search(Stack<Integer> stack1,Integer element){
//
//        for(int i = 0; i<stack1.size(); i++){
//            if(stack1.get(i) == element )
//                System.out.println("Stack Found");
//            else
//                System.out.println("not found");
//        }
//
//    }

//    public void min(){
//        for(int i=0; i<stack.length; i++){
//            for(int j= i+1; j<stack.length; j++)
//            if(stack[i] < stack[j])
//        }







}

