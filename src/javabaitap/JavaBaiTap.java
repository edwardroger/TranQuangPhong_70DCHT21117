/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabaitap;
import java.util.Scanner;

/**
 *
 * @author sgthu
 */
public class JavaBaiTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Bài tập Java buổi 1");
        System.out.println("1. Bài 11: In ra những số lẻ từ 1 đến 99.");
        System.out.println("2. Bài 12: Xuất ra tổng các số là bội của 7.");
        System.out.println("3. Bài 13: In ra tổng 1+2+3+...+n.");
        System.out.println("4. Bài 14: In ra tổng các số chẵn nếu n chẵn, lẻ nếu n lẻ.");
        System.out.println("5. Bài 15: In ra min và max trong 1 array.");
        System.out.println("6. Bài 16: Giải phương trình ax+b=0.");
        System.out.println("7. Bài 17: Đọc một số nguyên và cho biết số đó là chẵn hay lẻ.");
        System.out.println("8. Bài 1: Giải phương trình ax^2+bx+c=0.");
        System.out.println("9. Bài 2: Giải phương trình bậc nhất 2 ẩn.");
        System.out.println("10. Bài 3: Giải phương trình ax^4+bx+c=0.");
        System.out.println("11. Bài 4: Kiểm tra 3 số có tạo thành tam giác hay không? Tính P và S.");
        System.out.println("12. Bài 5: Kiểm tra số nguyên tố và in ra các snt nhỏ hơn.");
        System.out.println("=======================================================");
        a = input.nextInt();
        baitap b = new baitap();
        switch(a){
            case 1:
                b.bai1();
                break;
            case 2: 
                b.bai2();
                break;
            case 3:
                b.bai3();
                break;
            case 4:
                b.bai4();
                break;
            case 5:
                b.bai5();
                break;
            case 6:
                b.bai6();
                break;
            case 7: 
                b.bai7();
                break;
            case 8:
                b.bai8();
                break;
            case 9:
                b.bai9();
                break;
            case 10:
                b.bai10();
                break;
            case 11:
                b.bai11();
                break;
            case 12:
                b.bai12();
                break;
        }
    }
}
