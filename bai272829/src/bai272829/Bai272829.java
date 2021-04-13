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
public class Bai272829 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Bài tập Java buổi 1");
        System.out.println("1. Bài 27: In ra n số Fibonacci.");
        System.out.println("2. Bài 28: ");
        System.out.println("3. Bài 29: a");
        System.out.println("4. Bài 29: b");
        System.out.println("5. Bài 29: c");
        System.out.println("6. Bài 29: d");
        System.out.println("\n=======================================================\n");

        a = input.nextInt();
        baitap b = new baitap();
        
//        ComplexNumber n = new ComplexNumber();
        switch (a) {
            case 1:
                b.bai27();
                break;
            case 2:
                b.tamgiacvuongrong();
                break;
            case 3:
                b.bai29caua();
                break;
            case 4:
                b.bai29caub();
                break;
            case 5:
                b.bai29cauc();
                break;
            case 6:
                b.bai29caud();
                break;
        }

    }
}