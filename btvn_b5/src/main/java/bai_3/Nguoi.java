
package bai_3;

import java.util.Scanner;


public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Que quan: ");
        queQuan = sc.nextLine();
    }
    public  void xuat(){
        System.out.printf("%-30s %-15s %-40s ", hoTen, ngaySinh, queQuan);
    }
    
}
