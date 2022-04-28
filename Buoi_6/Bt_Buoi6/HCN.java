package Buoi_6.Bt_Buoi6;

public class HCN {
    protected double cd, cr;

    public HCN() {

    }

    public HCN(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCd() {
        return cd;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public double getCr() {
        return cr;
    }

    public double chuVi() {
        return (cd + cr) * 2;
    }

    public double dientich() {
        return cd * cr;
    }

    @Override
    public String toString() {
        return "Hinh chu nhat co Chieu dai: " + cd + ", Chieu rong: " + cr + ", Chu vi: " + chuVi() + " va Dien tich: "
                + dientich();
    }
}
