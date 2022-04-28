package Buoi_6.Bt_Buoi6.DTCV;

public class Circle implements Shape {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getr() {
        return r;
    }

    public void setr(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(this.r, 2));
    }

    @Override
    public double perimeter() {
        return (2 * this.r * Math.PI);

    }

}
