
package Bai_2;

import java.util.Scanner;


public class Date {
    private int D;
    private int M;
    private int Y;
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        D = sc.nextInt();
        System.out.println("Nhap thang: ");
        M = sc.nextInt();
        System.out.println("Nhap nam: ");
        Y = sc.nextInt();
    }
    public void Xuat(){
        System.out.println(D + "/" + M + "/" + Y);  
    }
}
