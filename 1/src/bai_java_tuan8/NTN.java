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
public class NTN {
static Scanner sc = new Scanner(System.in);
    private int year,month,day;

    public NTN() {
    }

    public NTN(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int daysIn(int a){
        a = this.month;
        if(a==1||a==3||a==5||a==7||a==8||a==10||a==12)
            return 31;
        if(a==4||a==6||a==9||a==11)
            return 30;
        if(a==2)
        {
            if(this.year % 4 == 0 )
                return 29;
            else
                return 28;
        }
        return 0;
        }
    public boolean normalize(){
           if(this.year<1 ||this.month<1 || this.month>12||this.day < 1 || this.day > daysIn(this.day))
               return true;
           else
           return false;
    }
   public void advance(){
        while(this.month > 12){
            this.year += this.month/12;
            this.month = this.month%12;
        }
        while(this.day > daysIn(this.day)){
            this.month += this.day/daysIn(this.day);
            this.day = this.day%daysIn(this.day);
        }
        System.out.printf("\nThời gian sau khi chuẩn hóa: %2d:%2d:%2d",this.day,this.month,this.year);
    }
   public void reset()
   {
        System.out.printf("\nThời gian reset là: %2d:%2d:%2d\n",this.day,this.month,this.year);
    }
    public void nhap(){
        while(normalize()){
        System.out.print("Nhập năm: ");
        this.year = sc.nextInt();
        System.out.print("Nhập tháng: ");
        this.month = sc.nextInt();
        System.out.print("Nhập ngày: ");
        this.day = sc.nextInt();}
    }
    public void xuat(){
        System.out.printf("%d/%d/%d",this.day,this.month,this.year);
    }
    public static void main(String[] args) {
        NTN ntn = new NTN();
        ntn.nhap();
        ntn.xuat();
        ntn.advance();
        ntn.reset();
    }
    
}

