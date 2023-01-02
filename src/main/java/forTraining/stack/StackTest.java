package forTraining.stack;

public class StackTest {
    public static void main(String[] args) {
        ObjectStack queue = new ObjectStack();

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
