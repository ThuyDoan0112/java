
package bai_3;

import java.util.Scanner;


public class SinhVien extends Nguoi{
    private String maSV;
    private String nganh;
    private int khoaHoc;

    public SinhVien(String maSV, String nganh, int khoaHoc) {
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public SinhVien() {
    }
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Ma sinh vien: ");
            setMaSV(sc.nextLine());
            System.out.println("Nganh: ");
            setNganh(sc.nextLine());
            System.out.println("Khoa hoc: ");
            setKhoaHoc(sc.nextInt());
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-15s %-15s %-10d \n", maSV, nganh, khoaHoc);
    }
}
