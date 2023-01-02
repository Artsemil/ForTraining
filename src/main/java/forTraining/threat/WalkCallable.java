package forTraining.threat;

import java.util.concurrent.Callable;

public class WalkCallable implements Callable<String> {
    @Override
    public String call() throws Exception {

        for (int i = 0; i < 3; i++) {
            System.out.println("Walking" + i);
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        return "";
    }
}

