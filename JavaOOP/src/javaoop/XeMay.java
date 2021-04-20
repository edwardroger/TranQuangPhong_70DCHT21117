/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author sgthu
 */
public class XeMay {
    
    private String tenChuXe;
    private String typeXe ;
    private float dungTich;
    private float giaTri;
    
 
    //khởi tạo constructor không tham số
    public XeMay() {
    }
 
    //khởi tạo constructor có tham số
    public XeMay(String tenChuXe, String typeXe, float dungTich, float giaTri, float tax) {
        this.tenChuXe = tenChuXe ;
        this.typeXe = typeXe;
        this.dungTich = dungTich;
        this.giaTri = giaTri;
    }
 
    //------------------begin getter and setter----------------------
 
    public String getTenChuXe() {
        return tenChuXe;
    }
    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }
    public String getTypeXe(){
        return typeXe;
    }
    public void setTypeXe(String typeXe) {
        this.typeXe = typeXe;
    }
 
    public float getDungTich() {
        return dungTich;
    }
 
    public void setDungTich(float dungTich) {
        this.dungTich = dungTich;
    }
 
    public float getGiaTri() {
        return giaTri;
    }
 
    public void setGiaTri(float giaTri) {
        this.giaTri = giaTri;
    }
 
    //-----------------------end getter and setter--------------------
    //tạo hàm tính điểm trung bình
    public float tax() {
       if(giaTri>200){
           return  giaTri*5/100;
       }
       else if(giaTri>100){
           return giaTri*3/100;
       }
       return  giaTri*1/100;
    }
 
    //sử dụng phương thức toString để hiển thị kết quả
   
    //hoặc có thể tạo một phương thức khác dùng để hiển thị kết quả
    public void inXe() {
        System.out.printf("%-18s %-15s %10.1f %10.1f %10.1f \n", tenChuXe, typeXe, dungTich, giaTri, tax());
    }
}
