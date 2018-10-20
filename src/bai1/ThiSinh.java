/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author nguyenmanh
 */
public class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void NhapTT(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien");
        System.out.print("Ho ten: ");
        this.hoTen = input.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = input.nextLine();
        System.out.print("Dia chi: ");
        this.diaChi = input.nextLine();
    }
    
    public void inTT(){
        System.out.println("------------Thong tin sinh vien--------------");
        System.out.println("Ho ten: "+ this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Dia chi: " + this.diaChi);
    }
}
