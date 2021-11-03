
package Bai1;

import java.util.Scanner;

public class Sach {
   private int maSach;
    private String tenSach;
    private String nxb;
    private int soTrang;
    private double giaTien;

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sach: ");
        maSach = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nhap nxb: ");
        nxb= sc.nextLine();
        System.out.println("Nhap so  trang: ");
        soTrang = sc.nextInt();
        System.out.println("nhap gia sach: ");
        giaTien= sc.nextDouble();
    }

   public void Xuat(){
         System.out.printf("%-10s %-30s %-20s %-10d %-8.5f \n", maSach, tenSach, nxb, soTrang, giaTien);    
    }
}
