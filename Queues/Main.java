package Queues;

public class Main {
    public static void main(String[] args) {
        LinkedQueues<Integer> queue = new LinkedQueues<>();


        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);

        System.out.println("-------------------------------");
        queue.print();
        queue.Deque();

        System.out.println("-------------------------------");
        queue.print();
        System.out.println("head Queue Is " + queue.FirstQ());

        System.out.println("-------------------------------");

        System.out.println("tail Queue Is " + queue.LastQ());



    }
}
