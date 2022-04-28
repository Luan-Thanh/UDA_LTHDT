package Buoi_6.Bt_Buoi6.DienTich;

public class Circle extends Shape {
    private double r;

    public Circle() {

    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(this.r, 2));
    }
}