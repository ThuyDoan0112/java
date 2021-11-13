/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RunMain {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        
        nhap(lopHoc);
        xuat(lopHoc);
        System.out.println("So hoc sinh khoa 15:  " + kiemtra(lopHoc));
        sapsep(lopHoc);
        xuat(lopHoc);
        
    }
    public static void nhap(LopHoc lopHoc){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma lop: ");
        lopHoc.setMaLH(sc.nextLine());
        System.out.println("Ten lop: ");
        lopHoc.setTenLH(sc.nextLine());
        System.out.println("Ngay mo: ");
        lopHoc.setNgayMo(sc.nextLine());
        System.out.println("Giao vien: ");
        lopHoc.setGiaoVien(sc.nextLine());
        System.out.println("Nhap so sinh vien: ");
        lopHoc.setN(sc.nextInt());
        ArrayList<SinhVien> x = new ArrayList<>();
        for(int i=0;i<lopHoc.getN();i++){
            SinhVien sinhvien = new SinhVien();
            sinhvien.nhap();
            x.add(sinhvien);
        }
        lopHoc.setX(x);
    }
    public static void xuat(LopHoc lopHoc) {
        System.out.println("Ma LH: " + lopHoc.getMaLH());
        System.out.println("Ten LH: " +lopHoc.getTenLH());
        System.out.println("Ngay mo: " + lopHoc.getNgayMo());
        System.out.printf("%-30s %-15s %-40s ", "Ho ten", "Ngay sinh", "Que quan");
        System.out.printf("%-15s %-15s %-10s \n", "Ma SV", "Nganh", "Khoa hoc");
        for(int i=0;i<lopHoc.getN();i++){
            lopHoc.getX().get(i).xuat();
        }
    }
    public static int kiemtra(LopHoc lopHoc) {
        int dem = 0;
        for(int i =0;i<lopHoc.getN();i++){
            if(lopHoc.getX().get(i).getKhoaHoc()==15){
                dem++;
            }
        }
        return dem;
    }
    public static void sapsep(LopHoc lopHoc) {
        for(int i=0;i<lopHoc.getN();i++){
            for(int j=1;j<lopHoc.getN();j++){
                if(lopHoc.getX().get(j).getKhoaHoc()<lopHoc.getX().get(i).getKhoaHoc()){
                    Collections.swap(lopHoc.getX(), i, j);
                }
            }
        }
    }
}
