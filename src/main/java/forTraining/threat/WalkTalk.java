package forTraining.threat;

public class WalkTalk {

    public static void main(String[] args) {

        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());
        // запуск потоков
        talk.start();
        walk.start();

    }
}
