/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1De6;

/**
 *
 * @author nguyenmanh
 */
public class Number {

    private int A;
    private int B;

    public Number() {
    }

    public Number(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int cong() {
        return this.A + this.B;
    }

    public int tru() {
        return this.A - this.B;
    }

    public int nhan() {
        return this.A * this.B;
    }

    public Float chia() {
        if (this.B == 0) {
            System.out.println("Khong the chia cho gia tri 0");
            return (float) 0;
        } else {
            return (float) this.A / this.B;
        }
    }

    public int UCLN() {
        int a = this.A;
        int b = this.B;
        // Nếu a = 0 => ucln(a,b) = b
        // Nếu b = 0 => ucln(a,b) = a
        if (a == 0 || b == 0) {
            return a + b;
        }
        // Lặp tới khi 1 trong 2 số bằng 0
        while (a * b != 0) {
            if (a > b) {
                a %= b; // a = a % b
            } else {
                b %= a;
            }
        }
        return a + b; // return a + b, bởi vì lúc này hoặc a hoặc b đã bằng 0.
    }
}
