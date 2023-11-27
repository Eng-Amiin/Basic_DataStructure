package Queues;

import java.util.EmptyStackException;


public class CircularArrayQ<T> {
    private static final int DEF_CAP = 3;
    private int count, front, rear;
    private T[] arrayQueue;

    public CircularArrayQ(int intialCapaciy) {
        count = front = rear = 0;
        arrayQueue = (T[]) (new Object[intialCapaciy]);
    }

    public CircularArrayQ() {
        this(DEF_CAP);
    }

    //Size
    public int Size() {
        return count;
    }

    //IsEmpty
    public boolean isEmpty() {
        return count == 0;
    }

    //Enque

    public void enqueue(T item) throws EmptyStackException {
        if (Size() == arrayQueue.length)
            throw new EmptyStackException();
        arrayQueue[rear] = item;
        rear = (rear + 1) % arrayQueue.length;
        count++;

    }


    //dequeue
    public T dequeue() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        T result = arrayQueue[front];
        arrayQueue[front] = null;
        front = (front + 1) % arrayQueue.length;
        count--;
        return result;
    }


    private void expandCapacity() {
        T[] large = (T[]) (new Object[arrayQueue.length * 2]);
        for (int i = 0; i < count; i++) {
            large[i] = arrayQueue[front];
            front = (front + 1) % arrayQueue.length;
        }
        front = 0;
        rear = count;
        arrayQueue = large;
    }

    public void printQ() throws EmptyStackException {

        if (isEmpty())
            throw new EmptyStackException();
        System.out.println("");
        int inddex = front;
        for (int i = 0; i < count; i++) {
            System.out.println(arrayQueue[inddex]);
            inddex = (inddex + 1) % arrayQueue.length;
        }
        System.out.println("");


    }

    //Last


    public String lastName() throws EmptyStackException{

        if(isEmpty())
            throw  new EmptyStackException();

        return "index " +(rear-1) + ":" + arrayQueue[rear-1] + "is the last Name";

    }

}
