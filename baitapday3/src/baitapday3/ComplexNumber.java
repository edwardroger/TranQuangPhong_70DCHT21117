/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapday3;

/**
 *
 * @author sgthu
 */
public class ComplexNumber {
    double real, img;
 
    //constructor để khởi tạo số phức
    ComplexNumber(double r, double i){
        this.real = r;
        this.img = i;
    }
 
    public ComplexNumber tong(ComplexNumber c1, ComplexNumber c2)
    {
        //tạo một số phức tạm thời để giữ tổng của hai số
        ComplexNumber temp = new ComplexNumber(0, 0);
 
        temp.real = c1.real + c2.real;//cộng các phần thực
        temp.img = c1.img + c2.img;//cộng các phần ảo
 
        //trả về số phức đầu ra
        return temp;
    }
   
    public ComplexNumber hieu(ComplexNumber c1, ComplexNumber c2)
    {
        //tạo một số phức tạm thời để giữ tổng của hai số
        ComplexNumber temp = new ComplexNumber(0, 0);
 
        temp.real = c1.real - c2.real;//cộng các phần thực
        temp.img = c1.img - c2.img;//cộng các phần ảo
 
        //trả về số phức đầu ra
        return temp;
    }
    public ComplexNumber tich(ComplexNumber c1, ComplexNumber c2)
    {
        //tạo một số phức tạm thời để giữ tổng của hai số
        ComplexNumber temp = new ComplexNumber(0, 0);
 
        temp.real = c1.real * c2.real;//cộng các phần thực
        temp.img = c1.img * c2.img;//cộng các phần ảo
 
        //trả về số phức đầu ra
        return temp;
    }
     public ComplexNumber thuong(ComplexNumber c1, ComplexNumber c2)
    {
        //tạo một số phức tạm thời để giữ tổng của hai số
        ComplexNumber temp = new ComplexNumber(0, 0);
 
        temp.real = c1.real / c2.real;//cộng các phần thực
        temp.img = c1.img / c2.img;//cộng các phần ảo
 
        //trả về số phức đầu ra
        return temp;
    }
    
    
    public void bai40(){
        ComplexNumber c1 = new ComplexNumber(5.2, 4.4);//nhập vào phần thực và phần ảo của số phức thứ nhất
        ComplexNumber c2 = new ComplexNumber(2.0, 7.3);//nhập vào phần thực và phần ảo của số phức thứ hai
        ComplexNumber tong = tong(c1, c2);
        ComplexNumber hieu = tong(c1, c2);
        ComplexNumber tich = tong(c1, c2);
        ComplexNumber thuong = tong(c1, c2);

        System.out.printf("Kết quả cộng là: "+ tong.real+" + "+ tong.img +"i");
        System.out.printf("Kết quả trừ là: "+ hieu.real+" + "+ hieu.img +"i");
        System.out.printf("Kết quả nhân là: "+ tich.real+" + "+ tich.img +"i");
        System.out.printf("Kết quả chia là: "+ thuong.real+" + "+ thuong.img +"i");

    }
}
