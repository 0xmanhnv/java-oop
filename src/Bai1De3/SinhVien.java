/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1De3;

import java.util.Scanner;

/**
 *
 * @author nguyenmanh
 */
public class SinhVien {
    private String hoTen;
    private String maSV;
    private Double diemHocPhan;
    private Double diemQuaTrinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, Double diemHocPhan, Double diemQuaTrinh) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemHocPhan = diemHocPhan;
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public Double getDiemHocPhan() {
        return diemHocPhan;
    }

    public void setDiemHocPhan(Double diemHocPhan) {
        this.diemHocPhan = diemHocPhan;
    }

    public Double getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(Double diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }
    
    public void nhapTT(){
        Scanner input = new Scanner(System.in);
        System.out.println("----- Nhap Thong Tin ------------");
        System.out.print("Ho ten: ");
        this.hoTen = input.nextLine();
        System.out.print("Ma sinh vien: ");
        this.maSV = input.nextLine();
        System.out.print("Diem qua trinh: ");
        
        input = new Scanner(System.in);
        this.diemQuaTrinh = input.nextDouble();
        System.out.println("Diem Hoc Phan: ");
        this.diemHocPhan = input.nextDouble();
    }
    
    public Double diemTrungBinh(){
        return (this.diemQuaTrinh * 0.3) + (this.diemHocPhan * 0.7);
    }
    
    public void inThongTin(){
        System.out.println("----------------------");
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ma sinh vien: " + this.maSV);
        System.out.println("Diem hoc phan: " + this.diemHocPhan);
        System.out.println("Diem qua trinh: " + this.diemQuaTrinh);
        System.out.println("Diem trung binh: " + this.diemTrungBinh());
        System.out.println("-----------------------");
    }
}
