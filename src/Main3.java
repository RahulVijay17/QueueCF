public class Main3 {

    public static void main(String[] args) {
        Queue queue=new Queue(2);
        queue.enqueue(3);

        queue.dequeue();

        queue.printQueue();
    }
}
