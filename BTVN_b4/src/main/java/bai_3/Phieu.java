
package bai_3;

import java.util.Scanner;


public class Phieu {
    private String maPhieu;
    private Hang[] x;
    private int n;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma phieu:  ");
        maPhieu = sc.nextLine();
        System.out.println("So luong hang n : ");
        n = sc.nextInt();
        x = new Hang[n];
        for(int i=0;i<n;i++){
            x[i] = new Hang();
            System.out.println("Nhap mat hang thu " + (i+1));
            x[i].nhap();
        }
    }
    public void xuat(){
        System.out.printf("%30s \n","THONG TIN PHIEU");
        System.out.println("Ma phieu: " + maPhieu);
        System.out.printf("%-10s %-30s %-10s \n", "Ma hang", "Ten hang", "Don gia");
        for(int i=0;i<n;i++){
            x[i].xuat();
        }
    }
}
