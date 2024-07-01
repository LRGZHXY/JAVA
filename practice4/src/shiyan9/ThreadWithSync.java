package shiyan9;

public class ThreadWithSync {
    private static Integer sum = 0;

    public static void main(String[] args) {
        Thread[] threads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(() -> {
                synchronized (sum) {
                    sum++;
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < 1000; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final sum with synchronization: " + sum);
    }
}

