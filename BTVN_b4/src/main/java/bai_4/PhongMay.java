
package bai_4;

import java.util.Scanner;


public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLi x;
    private May[] y;
    private int n;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma phong: ");
        maPhong = sc.nextLine();
        System.out.println("Ten phong: ");
        tenPhong = sc.nextLine();
        System.out.println("Dien tich: ");
        dienTich = sc.nextFloat();
        x = new QuanLi();
        x.nhap();
        System.out.println("Nhap so luong may tinh n: ");
        n = sc.nextInt();
        y = new May[n];
        for(int i=0;i<n;i++){
            y[i] =  new May();
            System.out.println("Nhap may thu " + (i+1));
            y[i].nhap();
        }
    }
    public void xuat(){
        System.out.printf("50%s","THONG TIN PHONG");
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong: " + tenPhong);
        System.out.println("Dien tich: " + dienTich);
        x.xuat();
        System.out.printf("%-15s %-20s %-15s \n", "Ma may", "Kieu may", "Tinh trang");
        for(int i=0;i<n;i++){
            y[i].xuat();
        }
    }
}
