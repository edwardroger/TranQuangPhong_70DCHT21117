/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopday2;

/**
 *
 * @author sgthu
 */
public class SinhVien {

    private int maSV;
    private String hoTen;
    private String diaChi;
    private String sTD;

    //khởi tạo constructor mặc định
    public SinhVien() {

    }

    //khởi tạo constructor có tham số
    public SinhVien(int maSV, String hoten, String diaChi, String sTD) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sTD = sTD;
    }

    //--------------begin getter and setter--------------------
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoten() {
        return hoTen;
    }

    public void setHoten(String hoten) {
        this.hoTen = hoten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsTD() {
        return sTD;
    }

    public void setsTD(String sTD) {
        this.sTD = sTD;
    }

    //khởi tạo phương thức hiển thị theo format
    public void hienThiTT() {
        System.out.printf("%-5d %-20s %-15s %-15s \n", maSV, hoTen, diaChi, sTD);
    }
}
