/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenmanh
 */
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        n = input.nextInt();
        
        ArrayList<ThiSinhKhoiA> listThiSinhKhoiA = new ArrayList<ThiSinhKhoiA>();
        ArrayList<ThiSinhKhoiC> listThiSinhKhoiC = new ArrayList<ThiSinhKhoiC>();
        
        // nhap thong tin n sinh vien khoi a
        System.out.println("-------Nhap thong tin cho thi sinh khoi a---------");
        for (int i = 0; i < n; i++) {
            System.out.println("Thi sinh thu " + (i+1));
            ThiSinhKhoiA    tska = new  ThiSinhKhoiA();
            tska.NhapTT();
            
            listThiSinhKhoiA.add(tska);
        }
        
        System.out.println("---------Nhap thong tin cho thi sinh khoi c--------");
        for (int i = 0; i < n; i++) {
            System.out.println("Thi sinh thu " + (i + 1));
            ThiSinhKhoiC tskc = new ThiSinhKhoiC();
            
            tskc.NhapTT();
            
            listThiSinhKhoiC.add(tskc);
        }
        
        System.out.println("------DANH SACH THI SINH TRUNG TUYEN -----------");
        
        System.out.println("--- Thi sinh khoi A trung tuyen");
        for (ThiSinhKhoiA student : listThiSinhKhoiA) {
            if(student.thiSinhTrungTuyen()){
                student.inTT();
            }
        }
        
        System.out.println("---- Thi sinh khoi C trung tuyen");
        for (ThiSinhKhoiC student : listThiSinhKhoiC) {
            if(student.thiSinhTrungTuyen()){
                student.inTT();
            }
        }
        
    }
}
