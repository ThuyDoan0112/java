
package bai_4;

import java.util.Scanner;


public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma may: ");
        maMay = sc.nextLine();
        System.out.println("Kieu may: ");
        kieuMay = sc.nextLine();
        System.out.println("Tinh trang: ");
        tinhTrang = sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%-15s %-20s %-15s \n", maMay, kieuMay, tinhTrang);
    }
}
