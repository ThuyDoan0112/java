
package bai_4;

import java.util.Scanner;

public class QuanLi {
    private String maQL;
    private String hoTen;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma quan li: ");
        maQL = sc.nextLine();
        System.out.println("Ho ten: ");
        hoTen = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma quan li: " + maQL);
        System.out.println("Ho ten: " + hoTen);
    }
}
