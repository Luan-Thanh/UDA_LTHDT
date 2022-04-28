package Buoi_6.Bt_Buoi6.DienTich;

public class Rectangle extends Shape {
    private double cd, cr;

    public Rectangle() {

    }

    public Rectangle(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public double area() {
        return this.cd * this.cr;
    }
}