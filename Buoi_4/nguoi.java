package Buoi_4;

public class nguoi {
    private String ten;
    private int tuoi;

    public void inNguoi() {
        System.out.println("Nguoi co ten: " + ten + ", tuoi: " + tuoi);
    }

    public nguoi() {
    }

    public nguoi(String ten, int tuoi) {
        this.ten = ten;
        if (tuoi > 0)
            this.tuoi = tuoi;
        else
            System.out.println("Ban nhap tuoi khong hop le!");
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi > 0)
            this.tuoi = tuoi;
        else
            System.out.println("Ban nhap tuoi khong hop le!");
    }

}
