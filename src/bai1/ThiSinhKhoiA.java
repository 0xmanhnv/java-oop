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
public class ThiSinhKhoiA extends ThiSinh {
    private Double diemToan;
    private Double diemLy;
    private Double diemHoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(Double diemToan, Double diemLy, Double diemHoa, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public Double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(Double diemToan) {
        this.diemToan = diemToan;
    }

    public Double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(Double diemLy) {
        this.diemLy = diemLy;
    }

    public Double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(Double diemHoa) {
        this.diemHoa = diemHoa;
    }
    
    public void NhapTT(){
        super.NhapTT();
        Scanner input = new Scanner(System.in);
        System.out.print("Diem toan: ");
        this.diemToan = input.nextDouble();
        System.out.print("Diem Ly: ");
        this.diemLy = input.nextDouble();
        System.out.print("Diem Hoa: ");
        this.diemHoa = input.nextDouble();
    }
    
    public void inTT(){
        super.inTT();
        System.out.println("Diem toan: " + this.diemToan);
        System.out.println("Diem ly: " + this.diemLy);
        System.out.println("Diem hoa: " + this.diemHoa);
    }
}
