public class RTriangle implements IShape {
    private double a; // 直角边 a
    private double b; // 直角边 b

    // 构造方法
    public RTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // 实现接口中的 getArea 方法
    @Override
    public double getArea() {
        return 0.5 * a * b;
    }

    // 实现接口中的 getPerimeter 方法
    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(a * a + b * b); // 计算斜边 c
        return a + b + hypotenuse;
    }
}
