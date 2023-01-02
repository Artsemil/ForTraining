package forTraining.threat.temp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import forTraining.threat.WalkCallable;

public class TempTest {

    public static void main(String[] args) {

        List<Future<?>> loadScriptResults = new CopyOnWriteArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            loadScriptResults.add(executor.submit(new WalkCallable()));
        }
        executor.shutdown();

        while (!executor.isTerminated()) {
            System.out.println(("Active threads:" + ((ThreadPoolExecutor) executor).getActiveCount()
                    + "   Complete threads:" + ((ThreadPoolExecutor) executor).getCompletedTaskCount()));

        }

        System.out.println("Finished all threads");
        System.out.println("hello");
    }
}
