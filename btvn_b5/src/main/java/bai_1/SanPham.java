
package bai_1;

import java.util.Scanner;


public class SanPham {
    protected String maSP;
    protected String tenSP;
    protected String hangSX;
    protected String ngayNhap;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma san pham: ");
        maSP = sc.nextLine();
        System.out.println("Ten san pham: ");
        tenSP = sc.nextLine();
        System.out.println("Hang san xuat: ");
        hangSX = sc.nextLine();
        System.out.println("Ngay nhap: ");
        ngayNhap = sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%-10s %-30s %-20s %-15s ", maSP, tenSP, hangSX, ngayNhap);
    }
}
