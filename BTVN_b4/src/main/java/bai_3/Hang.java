
package bai_3;

import java.util.Scanner;


public class Hang {
    private String maHang;
    private String tenHang;
    private float donGia;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma hang: ");
        maHang = sc.nextLine();
        System.out.println("Ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Don gia: ");
        donGia = sc.nextFloat();
    }
    public void xuat(){
        System.out.printf("%-10s %-30s %-8.5f \n", maHang, tenHang, donGia);
    }
            
}
