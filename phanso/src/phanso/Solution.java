/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author sgthu
 */
public class Solution {
      private int tu, mau;
 
    public Solution(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }
     
     public int getTu() {
        return tu;
    }
 
    public void setTu(int tu) {
        this.tu = tu;
    }
 
    public int getMau() {
        return mau;
    }
 
    public void setMau(int mau) {
        this.mau = mau;
    }
 
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public void congPhanSo(Solution ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Solution phanSoTong = new Solution(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
      
    public void truPhanSo(Solution ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Solution phanSoHieu = new Solution(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
     
    public void nhanPhanSo(Solution ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        Solution phanSoTich = new Solution(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
     
    public void chiaPhanSo(Solution ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        Solution phanSoThuong = new Solution(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
}
