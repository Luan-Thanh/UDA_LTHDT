package Buoi_3.Bt_Buoi3;

import Learn_LDHDT.person;

public class Bai_1 {
    public static void main(String[] args) {
        Person per;
        try {
            per = new Person("Le Thanh Luan", 18, "K106/04");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            per = new Person();
        }
        per.printPreson();
    }
}