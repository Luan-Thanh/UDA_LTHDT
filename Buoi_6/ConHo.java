package Buoi_6;

public class ConHo extends DongVat implements KyNang {

    public ConHo() {
    }

    public ConHo(String ten) {
        super(ten);
    }

    @Override
    public void an() {
        System.out.println("Con ho co ten: " + getTen() + " thich an thit");
        // System.out.println();
    }

    @Override
    public void KhaNang() {
        System.out.println("Ky nang con ho co ten: " + getTen() + " san moi gioi");
    }

}
