/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapday3;

import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sgthu
 */
public class baitap {

    public void bai20() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String str = input.nextLine();

        int digitCount = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                digitCount++;
            }
        }
        System.out.println("So chu so: " + digitCount);
    }

    public void bai21() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String str = input.nextLine();
        String[] a = str.split(" ,.;");
        System.out.println(Arrays.toString(a));
    }

    public void bai22() {

        int temp;
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int n = input.nextInt();

        for (int i = 2; i <= n / 2; i++) {
            temp = n % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " Là số nguyên tố!");
        } else {
            System.out.println(n + " Không phải là số nguyên tố!");
        }
    }

    public void bai23() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a = ");
        int a = input.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = input.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b + " là: " + USCLN(a, b));
    }

    private int USCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }

    public void bai24() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.println("Tổng các số bé hơn " + n + " là: " + sum);
        }
    }

    public void bai25() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (ktsnt(i) == 1) {
                sum += i;
            }
        }
        System.out.println("Tổng các số nguyên tố bé hơn " + n + " là: " + sum);

    }

    private int ktsnt(int n) {
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public void bai26() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so n:");
        int n = input.nextInt();
        int sum = 0;
        int k = 0;
        for (int i = 2; i < 1000; i++) {
            if (ktsnt(i) == 1) {
                k++;
                sum += i;
                if (k == n) {
                    break;
                }
            }
        }
        System.out.println("Tong cac so nguyen to la: " + sum);
    }

}
