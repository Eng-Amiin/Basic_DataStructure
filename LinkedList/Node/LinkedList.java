package LinkedList.Node;

import java.util.EmptyStackException;

public class LinkedList<T> {
    private int count;
    private Node<T> top;

    public LinkedList() {
        count = 0;
        top = null;
    }

    public int Size() {
        return count;
    }

    public boolean isempty() {
        return count == 0;
    }

    public void push(T element) {

        Node<T> temp = new Node<>(element);
        temp.setNext(top);
        top = temp;
        count++;

    }

    public T pop() {

        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }


    public T Peek() throws EmptyStackException {
        if (isempty())
            throw new EmptyStackException();
        return top.getElement();
    }

    public void printStack(){
        if (isempty())
            System.out.println("[");
        Node<T> current = top;
        while (current != null) {
            System.out.println(current.getElement());


            System.out.println("]");
            current = current.getNext();
        }


    }



  public void botton(){
      var current = top;
      T element = null;

      while(current != null){
          current.getNext();
          if(current == null)
              element = current.getElement();
      }



  }












}

