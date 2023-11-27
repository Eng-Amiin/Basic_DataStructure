package Queues;

public class Functions<T> {

    static LinkedQueues<Integer> queue = new LinkedQueues<>();
    public static void main(String[] args) {


        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);


        System.out.println(searching(2));

        System.out.println();

    }

//    public void Max(){
//        int max ;
//
//        if(int i = 10; i>queue.Size(); i++)
//    }

    static   int searching( int element) {
        int index=1;
        boolean isfound=false;
        Node<Integer> serach = new Node<>();
        for (int i =0; i<queue.Size();i++){
            if(queue.Size() == element)
            {
                isfound=true;
                break;
            }
            index++;
        }
        return (isfound) ? index : -1;
    }

}
