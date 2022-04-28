package Buoi_6.Bt_Buoi6.DTCV;

public class Rectangle implements Shape {
    private double cd, cr;

    public Rectangle() {
    }

    public Rectangle(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public double getcd() {
        return cd;
    }

    public void setcd(double cd) {
        this.cd = cd;
    }

    public double getcr() {
        return cr;
    }

    public void setcr(double cr) {
        this.cr = cr;
    }

    @Override
    public double area() {
        return this.cd * this.cr;
    }

    @Override
    public double perimeter() {
        return (this.cd + this.cr) * 2;
    }

}
