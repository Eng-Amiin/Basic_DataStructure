package Queues;

public class Node<T> {

    private T element;
    private Node<T> next;

    Node(){
        element = null;
        next = null;
    }

    Node(T elemenet){
        this.element = elemenet;
        next =null;
    }

    public T getElement(){
        return element;
    }

    public void setElement(T element){
        this.element =element;

    }

    public Node<T> getNext(){
        return next;
    }
    public void setNext(Node<T> next){
        this.next = next;

    }



































}
