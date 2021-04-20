/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author sgthu
 */
public class Phanso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Solution phanSo1 = new Solution(13, 3); 
        Solution phanSo2 = new Solution(4, 5);
        
        phanSo1.congPhanSo(phanSo2);
        
        phanSo1.truPhanSo(phanSo2);
        
        phanSo1.nhanPhanSo(phanSo2);
        
        phanSo1.chiaPhanSo(phanSo2);
    }

}
