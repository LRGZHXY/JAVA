package shiyan9;

public class Test implements Runnable {
    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        Thread t = new Thread(this);
        t.start(); // 只启动一次线程
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
