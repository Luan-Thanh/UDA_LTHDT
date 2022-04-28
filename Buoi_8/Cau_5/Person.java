package Buoi_8.Cau_5;

public class Person {
    private String hoTen;
    private String diaChi;

    public Person() {
    }

    public Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getdiaChi() {
        return diaChi;
    }

    public void setdiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person [ Ho ten: " + hoTen + " - Dia chi: " + diaChi + " ]";
    }
}
