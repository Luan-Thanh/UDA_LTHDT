package Buoi_6;

public abstract class DongVat {
    private String ten;

    public DongVat() {
    }

    public DongVat(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void ngu() {
        System.out.println("Dong vat: " + ten + " thich ngu");
    }

    public abstract void an();
}
