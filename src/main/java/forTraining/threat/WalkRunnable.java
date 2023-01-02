package forTraining.threat;

public class WalkRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Walking" + i);
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
