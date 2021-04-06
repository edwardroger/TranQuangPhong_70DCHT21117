/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapday3;

import java.util.Scanner;

/**
 *
 * @author sgthu
 */
public class Baitapday3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Bài tập Java buổi 1");
        System.out.println("1. Bài 20: Đếm số ký tự trong chuỗi s.");
        System.out.println("2. Bài 21: Tách chuỗi.");
        System.out.println("3. Bài 22: Kiểm tra số nguyên tố.");
        System.out.println("4. Bài 23: Tìm UCLN của 2 số.");
        System.out.println("5. Bài 24: Tính tổng N số nguyên.");
        System.out.println("6. Bài 25: Tổng các số nguyên tố nhỏ hơn n.");
        System.out.println("7. Bài 36: Tổng các phần tử trên đường viền matrix mxn.");
        System.out.println("8. Bài 37: Tổng các phần tử trên hàng k cột k của matrix mxn.");
        System.out.println("9. Bài 39: Sắp xếp chiều giảm dần ma trận mxn.");
        System.out.println("10. Bài 40: Tính tổng, hiệu, thương, tích của 2 số thực.");
        System.out.println("\n=======================================================\n");

        a = input.nextInt();
        baitap b = new baitap();
        matrix m = new matrix();
        ComplexNumber n = new ComplexNumber();
        switch (a) {
            case 1:
                b.bai20();
                break;
            case 2:
                b.bai21();
                break;
            case 3:
                b.bai22();
                break;
            case 4:
                b.bai23();
                break;
            case 5:
                b.bai24();
                break;
            case 6:
                b.bai25();
                break;
            case 7:
                m.bai36();
                break;
            case 8:
                m.bai37();
                break;
            case 9:
                m.bai39();
                break;
            case 10:
                n.bai40();
                break;

            // TODO code application logic here
        }

    }
}
