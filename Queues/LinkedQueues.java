package Queues;

import javax.sound.midi.Soundbank;
import java.util.EmptyStackException;

public class LinkedQueues<T> {


    private Node<T> head;
    private Node<T> tail;
    private int counter;

    public LinkedQueues(){
        head =null;
        tail =null;
        counter = 0;
    }

    //isEmpty
    public boolean isEmpty(){
        return counter == 0;
    }

    //Size
    public int Size(){
        return counter;
    }


    //Enqueue


    public void Enqueue(T element){
        Node<T> newNode = new Node<>(element);
        if(isEmpty())
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        counter++;
    }

    //Dequeue
    public T Deque() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T result = head.getElement();
        head = head.getNext();
        counter--;
        return result;
    }

    //print
    public void print() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        Node<T> current = head;
        while (current != null){
            System.out.println(current.getElement() + " ");
            current = current.getNext();
        }

        System.out.println(  );
    }


    //First
    public T FirstQ(){
        return head.getElement();
    }

    //Last

    public T LastQ(){

        return tail.getElement();
    }

    //Enter Data At The Middle
//    public void MiddleData(T element){
//        Node<T> newNode = new Node<>(element);
//        Node<T> current = head;
//        for (int i = 0; i<)
//    }


    //Serching





}
