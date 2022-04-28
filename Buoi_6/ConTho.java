package Buoi_6;

public class ConTho extends DongVat {

    public ConTho() {
    }

    public ConTho(String ten) {
        super(ten);
    }

    @Override
    public void an() {
        System.out.println("Con tho co ten: " + getTen() + " thich an co");
        System.out.println();
    }

}
