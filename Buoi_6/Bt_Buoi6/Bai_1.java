package Buoi_6.Bt_Buoi6;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        HCN hcn1 = new HCN();

        hcn1.setCd(6.4);
        System.out.println("Chieu dai = " + hcn1.getCd());

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu rong = ");
        hcn1.setCr(sc.nextDouble());

        System.out.println(hcn1);
    }
}
