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
public class ThiSinhKhoiC extends ThiSinh {
    private Double diemVan;
    private Double diemSu;
    private Double diemDia;

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(Double diemVan, Double diemSu, Double diemDia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public Double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(Double diemVan) {
        this.diemVan = diemVan;
    }

    public Double getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(Double diemSu) {
        this.diemSu = diemSu;
    }

    public Double getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(Double diemDia) {
        this.diemDia = diemDia;
    }
    
    public void NhapTT(){
        
        super.NhapTT();
        Scanner input = new Scanner(System.in);
        System.out.print("Diem van: ");
        this.diemVan = input.nextDouble();
        System.out.print("Diem Su: ");
        this.diemSu = input.nextDouble();
        System.out.print("Diem Dia: ");
        this.diemDia = input.nextDouble();
    }
    
    public void inTT(){
        super.inTT();
        System.out.println("Diem van: " + this.diemVan);
        System.out.println("Diem Su: " + this.diemSu);
        System.out.println("Diem Dia: " + this.diemDia);
    }
    public boolean thiSinhTrungTuyen(){
        Double tongDiem = this.diemDia + this.diemSu + this.diemVan;
        
        if(tongDiem > 20){
            return true;
        }else{
            return false;
        }
    }
}
