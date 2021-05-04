/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai_java_tuan8;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class GPG {
static Scanner sc = new Scanner(System.in);
    private int hour,minutes,second;

    public GPG() {
        this.hour =0;
        this.minutes =0;
        this.second =0;
    }

    public GPG(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }
    
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public boolean normalize(){
        if(this.hour    < 0 || this.hour    >= 24 || 
           this.minutes < 0 || this.minutes >= 60 || 
           this.second  < 0 || this.second  >= 60   )
            return false;
        else
        return true;
    }
    public void advance(){
        while(this.second >= 60)
        {
            this.minutes += 1;
            this.second -= 60;
        }
        while(this.minutes >= 60)
        {
            this.hour += 1;
            this.minutes -= 60;
        }
        while(this.hour >= 24)  
            this.hour -= 24;
        System.out.printf("\nThời gian sau khi chuẩn hóa: %2d:%2d:%2d",this.hour,this.minutes,this.second);
    }
    public void reset()
    {
        System.out.printf("\nThời gian reset là: %2d:%2d:%2d\n",hour,minutes,second);
    }
    public void nhap(){
        while(normalize()){
        System.out.print("Nhập giờ: ");
        this.hour = sc.nextInt();
        System.out.print("Nhập phút: ");
        this.minutes = sc.nextInt();
        System.out.print("Nhập giây: ");
        this.second = sc.nextInt();
        }
    }
    public void xuat(){
        System.out.printf("%2d:%2d:%2d",this.hour,this.minutes,this.second);
    }
    
    public static void main(String[] args) {
        GPG gpg = new GPG();
        gpg.nhap();
        gpg.xuat();
        gpg.advance();
        gpg.reset();
    }
    
}

