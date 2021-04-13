/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai272829;

import java.util.Scanner;

/**
 *
 * @author sgthu
 */
public class baitap {

    public void bai27() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n+" số đầu tiên của dãy số fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public void bai29caua() {
        int height;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("height = ");
            height = input.nextInt();
        } while (height <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void tamgiacvuongrong() {

        int height;
        int i;
        Scanner input = new Scanner(System.in);

        System.out.print("height = ");
        height = input.nextInt();

        for (i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == height) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public void bai29cauc() {
        int height;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("height = ");
            height = sc.nextInt();
        } while (height <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void bai29caud() {
        int height;
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("height = ");
        height = sc.nextInt();

        for (i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == height) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public void bai29caub() {
        int height;
        int i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("height = ");
        height = sc.nextInt();

        for (i = height; i > 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
