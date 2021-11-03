
package Bai_2;

import java.util.Scanner;

public class NhanSu {
    private String maNS;
    private String hoTen;
    private Date NS;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan su: ");
        maNS = sc.nextLine();
        System.out.println("Nhap ho ten");
        hoTen = sc.nextLine();
        NS = new Date();
        System.out.println("Ngay sinh: ");
        NS.Nhap();
    }
    public void xuat(){
        System.out.println("Ma nhan su: " + maNS);
        System.out.println("Ho ten: " + hoTen);
        System.out.print("Ngay sinh: ");
        NS.Xuat();
    }
}
