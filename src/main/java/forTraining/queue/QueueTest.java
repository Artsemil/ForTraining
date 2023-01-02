package forTraining.queue;

public class QueueTest {
    public static void main(String[] args) {
        ObjectQueue queue = new ObjectQueue();

        for (int i = 0; i < 10; i++) {
            queue.push("String: " + i);
        }

        while (queue.size()>0){
            String s = (String) queue.pull();
            System.out.println(s);
            System.out.println("Размер очереди:" + queue.size());
        }
    }
}
