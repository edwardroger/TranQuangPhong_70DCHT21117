/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author sgthu
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng và cột của ma trận: ");
        int n = scanner.nextInt();
//        System.out.print("Nhập số cột của ma trận: ");
//        int m = scanner.nextInt();
        int[][] arr = new int[n][n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Các phần tử của (ma trận) mảng hai chiều: ");
        show(arr);
        count(arr);
    }
    public static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void count(int[][] arr){
        int s = 0;
        for (int i = 0; i < arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                if(arr[i][j]==arr[j][i]){
                } else {
                    s+=arr[i][j];
                }
            }
        }
        System.out.println("Tong: "+s);
        
    }
}


