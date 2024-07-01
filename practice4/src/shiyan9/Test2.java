package shiyan9;

public class Test2 implements Runnable {
    public static void main(String[] args) {
        new Thread(new Test()).start();
    }

    public Test2() {
        // 无需在构造函数中再次创建 Test 实例
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
