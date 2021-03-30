/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabaitap;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author sgthu
 */
public class baitap {

    public void bai1() {
        int s = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                s += i;
            }
        }
        System.out.println("Tổng các số lẻ từ 1 - 100 là: " + s);
    }

    public void bai2() {
        int s = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                s += i;
            }
        }
        System.out.println("Tổng các số là bội của 7: " + s);
    }

    public void bai3() {
        int s = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số n:");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            s += i;
        }
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + s);
    }

    public void bai4() {
        int s = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số n:");
        int n = input.nextInt();
        if (n % 2 == 0) {
            for (int i = 0; i <= n; i++) {
                s += i;
            }
            System.out.println(n + " là số chẵn.");
            System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + s);
        } else {
            for (int i = 0; i <= n; i++) {
                s += i;
            }
            System.out.println(n + " là số lẻ.");
            System.out.println("Tổng các số lẻ từ 1 đến " + n + " là: " + s);
        }

    }

    public void bai5() {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = input.nextInt();
        }
        System.out.print("Các phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int max = 0;
        int min = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            System.out.println("max: "+max+"/nmin: "+min);
        }
    }

    public void bai6() {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        int a = input.nextInt();
        System.out.println("Nhập vào số b:");
        int b = input.nextInt();
        System.out.println("Phương trình có dạng: " + a + " x  " + b + "  =  0");
        x = -b / a;
        System.out.println("Nghiệm của phương trình là: " + x);
    }

    public void bai7() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 0) {
            System.out.println(n + " là zero.");
        } else if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }
    }

    public void bai8() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = input.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = input.nextInt();
        System.out.println("Nhập vào số c: ");
        int c = input.nextInt();
        System.out.println("Phương trình có dạng: " + a + " x^2 " + b + " x " + c + " = 0");
        int delta = b * b - 4 * a * c;
        double x, x1, x2;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                x = -c / b;
                System.out.println("Nghiệm phương trình bậc nhất là: x = " + x);
            }
        } else {
            if (delta < 0) {
                System.out.println("Phương trình có nghiệm ảo");
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.println("Nghiệm kép của phương trình là: x1 = x2 = " + x);
            } else {
                x1 = (-b + sqrt(delta)) / (2 * a);
                x2 = (-b - sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm x1 = " + x1 + "/nNghiệm x2 = " + x2);
            }
        }

    }

    public void bai9() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số a1: ");
        int a1 = input.nextInt();
        System.out.println("Nhập vào số b1: ");
        int b1 = input.nextInt();
        System.out.println("Nhập vào số c1: ");
        int c1 = input.nextInt();
        System.out.println("Nhập vào số a2: ");
        int a2 = input.nextInt();
        System.out.println("Nhập vào số b2: ");
        int b2 = input.nextInt();
        System.out.println("Nhập vào số c2: ");
        int c2 = input.nextInt();
        double D, Dx, Dy, x, y;
        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (Dx + Dy == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } else {
            x = Dx / D;
            y = Dy / D;
            System.out.println("Hệ phương trình có nghiệm (x,y )= "+"("+x+","+y+")");
        }
    }

    public void bai10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = input.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = input.nextInt();
        System.out.println("Nhập vào số c: ");
        int c = input.nextInt();
        System.out.println("Phương trình có dạng: " + a + " x^2 " + b + " x " + c + " = 0");
        int delta = b * b - 4 * a * c;
        double x, x1, x2;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                x = sqrt(-c / b);
                System.out.println("Nghiệm phương trình bậc nhất là: x1 = " + x + " x2 = " + (-x));
            }
        } else {
            if (delta < 0) {
                System.out.println("Phương trình có nghiệm ảo");
            } else if (delta == 0) {
                x = sqrt(-b / (2 * a));
                System.out.println("Nghiệm kép của phương trình là: x1 = x2 = " + x + "và x3 = x4 = " + (-x));
            } else {
                x1 = sqrt((-b + sqrt(delta)) / (2 * a));
                x2 = sqrt((-b - sqrt(delta)) / (2 * a));
                System.out.println("Nghiệm x1 = " + x1 + " Nghiệm x3 = " + (-x1) + "/nNghiệm x2 = " + x2 + "Nghiệm x4 = " + (-x2));
            }
        }
    }

    public void bai11() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = input.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = input.nextInt();
        System.out.println("Nhập vào số c: ");
        int c = input.nextInt();
        int P;
        double S;
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c && c == a) {
                System.out.println("Tam giác ABC là tam giác đều.");
            } else if (a == b || b == c || c == a) {
                System.out.println("Tam giác ABC là tam giác cân.");
            } else if (c * c == a * a + b * b || a * a == b * b + c * c || b * b == a * a + c * c) {
                System.out.println("Tam giác ABC là tam giác vuông.");
            } else {
                System.out.println("Tam giác ABC là tam giác thường.");
            }
            P = a + b + c;
            S = sqrt(P * (P - a) * (P - b) * (P - c));
            System.out.println("Chu vi tam giác là: P = " + P + "/nDiện tích tam giác là: S = " + S);
        }
    }

    public void bai12() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        int n = input.nextInt();
        int dem = 0;
        int tong = 0;
        if (n == 2) {
            System.out.println(n + " là số nguyên tố.");
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(n + " không phải số nguyên tố.");
            } else {
                System.out.println(n + " là số nguyên tố.");
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem++;
                }
                if (dem <= 2) {
                    tong = tong + i;
                }
            }
        }
        System.out.println("Tổng các số nguyên tố nhỏ hơn " + n + " là: " + tong);

    }
}
