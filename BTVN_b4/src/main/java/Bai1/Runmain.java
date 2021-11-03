
package Bai1;

import java.util.Scanner;

public class Runmain {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong sach: ");
        do {
            n = sc.nextInt();
        } while(n<=0);
        Sach[] x = new Sach[n];
        for(int i=0; i<n; i++) {
            x[i] = new Sach();
            System.out.println("Nhap cuon sach thu " + (i+1));
            x[i].Nhap();
        }
        System.out.printf("%50s \n","THONG TIN SACH");
         System.out.printf("%-10s %-30s %-20s %-10s %-10s \n", "Ma sach", "Ten sach", "Nha xuat ban", "So trang", "Gia tien"); 
        for(int i=0; i<n; i++) {
            x[i].Xuat();
        }
    }
}
