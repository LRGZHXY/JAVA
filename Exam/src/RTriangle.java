class RTriangle implements IShape{
    private double hight;
    private double wight;

    public RTriangle(double hight, double wight) {
        this.hight = hight;
        this.wight = wight;
    }

    @Override
    public double getArea() {
        return (hight*wight)/2;
    }

    @Override
    public double getPerimeter() {
        return (hight+wight)+Math.sqrt((hight*hight)+(wight*wight));
    }
}
