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
public class matrix {

    static int n, m, A[][];

    public int[][] nhapmatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so hang: ");
        n = input.nextInt();
        System.out.println("nhap so cot: ");
        m = input.nextInt();
        A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  a[" + i + "," + j + "]=");
                A[i][j] = input.nextInt();
            }
            System.out.println();
        }
        return A;
    }

    public void xuatmatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public void bai36() {
        System.out.println("Nhập vào ma trận: ");
        int[][] bai36 = nhapmatrix();
        System.out.println("Xuất ma trận: ");
        xuatmatrix();
        //tinh
        int s = 0;
        for (int i = 0; i < m; i++) {
            s = s + bai36[i][0] + bai36[i][n - 1];
        }
        for (int j = 1; j < n - 1; j++) {
            s = s + bai36[0][j] + bai36[m - 1][j];
        }
        System.out.println("Tổng đường biên của matrix: " + s);
    }

    public void bai37() {
        System.out.println("Nhập vào ma trận: ");
        int[][] bai37 = nhapmatrix();
        System.out.println("Xuất ma trận: ");
        xuatmatrix();
        int s = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số k: ");
        int k = input.nextInt();
        for (int i = 0; i <= k; i++) {
            s = s + bai37[i][k];
        }
        for (int j = 1; j < k; j++) {
            s = s + bai37[k][j];
        }
        System.out.println("Tổng đường biên của matrix: " + s);

    }

    public void bai39() {
        System.out.println("Nhập vào ma trận: ");
        int[][] bai39 = nhapmatrix();
        System.out.println("Xuất ma trận: ");
        xuatmatrix();
        int tg;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = j + 1; k < m; k++) {
                    if (bai39[i][j] < bai39[i][k]) {
                        tg = bai39[i][j];
                        bai39[i][j] = bai39[i][k];
                        bai39[i][k] = tg;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = i + 1; k < n; k++) {
                    if (bai39[i][j] < bai39[k][j]) {
                        tg = bai39[i][j];
                        bai39[i][j] = bai39[k][j];
                        bai39[k][j] = tg;
                    }
                }
            }
        }
        System.out.println("Ma tran a chieu giam dan: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(bai39[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

}
