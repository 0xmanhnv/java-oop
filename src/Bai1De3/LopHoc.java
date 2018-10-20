/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1De3;

import java.util.ArrayList;

/**
 *
 * @author nguyenmanh
 */
public class LopHoc {
    private ArrayList<SinhVien> danhSachSinhVien;
    private int siSo;
    
    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(ArrayList<SinhVien> danhSachSinhVien, int siSo, String tenLop) {
        this.danhSachSinhVien = danhSachSinhVien;
        this.siSo = siSo;
        this.tenLop = tenLop;
    }

    public ArrayList<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void setDanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    
    
}
