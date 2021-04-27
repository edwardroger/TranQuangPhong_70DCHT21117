/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopday2;

import java.util.Scanner;

/**
 *
 * @author sgthu
 */
public class OopDay2 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static void nhapThongTinh(SinhVien tt) {
        System.out.println("Nhập mã số sinh viên: ");
        tt.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập họ và tên sinh viên: ");
        tt.setHoten(sc.nextLine());
        System.out.println("Nhập địa chỉ sinh viên: ");
        tt.setDiaChi(sc.nextLine());
        do {
            System.out.println("Nhập số điện thoại bao gồm 7 số: ");
            tt.setsTD(sc.nextLine());
        } while (tt.getsTD().length() != 7);
    }

    static void nhapAlbum(Album ab) {
        System.out.print("Nhập mã CD: ");
        ab.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên CD : ");
        ab.setTenCD(sc.nextLine());
        System.out.print("Nhập tên ca sĩ : ");
        ab.setCaSy(sc.nextLine());
        System.out.print("Nhập số lượng bài hát : ");
        ab.setSoBH(sc.nextInt());
        System.out.print("Nhập giá thành : ");
        ab.setGiaThanh(sc.nextFloat());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào yêu cầu: \n");
        System.out.println("1. Hàng thực phẩm: \n");
        System.out.println("2. Sinh viên: \n");
        System.out.println("3. CD: \n");
        System.out.println("=========================\n");
        int b = scanner.nextInt();
        switch (b) {
            case 1:
                HangThucPham tp = new HangThucPham();
                boolean kt = true;
                boolean th = true;
                System.out.println("Nhập mã hàng : ");
                tp.setMaHang(scanner.nextInt());
                scanner.nextLine();
                do {
                    System.out.println("Nhập tên hàng : ");
                    tp.setTenHang(scanner.nextLine());
                } while (tp.kiemTraTenHang(kt));
                System.out.println("Nhập đơn giá : ");
                tp.setDonGia(scanner.nextDouble());
                do {
                    System.out.println("Nhập năm,tháng,ngày sản xuất : ");
                    tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    System.out.println("nhập năm,tháng,ngày hết hạn : ");
                    tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                } while (tp.kiemTraNgay(th));
                System.out.println(tp);
                tp.kiemTraHSD();
                break;
            case 2:
                SinhVien sv[] = null;
                int a,
                 n = 0;
                boolean flag = true;
                do {
                    System.out.println("Bạn chọn làm gì?");
                    System.out.println("1.Nhập thông tin sinh viên. \n"
                            + "2.Xuất bản danh sách sinh viên.\n"
                            + "Nhập số khác để thoát");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("Nhập số lương sinh viên cần khai báo: ");
                            n = sc.nextInt();
                            sv = new SinhVien[n];
                            for (int i = 0; i < n; i++) {
                                System.out.println("Sinh viên thứ " + (i + 1) + ": ");
                                sv[i] = new SinhVien();
                                nhapThongTinh(sv[i]);

                            }

                            break;
                        case 2:
                            SinhVien temp = sv[0];
                            for (int i = 0; i < sv.length - 1; i++) {
                                for (int j = i + 1; j < sv.length; j++) {
                                    if (sv[i].getMaSV() > sv[j].getMaSV()) {
                                        temp = sv[j];
                                        sv[j] = sv[i];
                                        sv[i] = temp;
                                    }
                                }
                            }
                            System.out.printf("%-5s %15s %15s %20s \n", "MSSV", "Họ và tên", "Địa chỉ", "Số điện thoại");
                            for (int i = 0; i < n; i++) {
                                sv[i].hienThiTT();
                            }
                            break;
                        default:
                            System.out.println("Goodbye");
                            flag = false;
                            break;
                    }
                } while (flag);
                break;
            case 3:
                Album alb[] = null;
                int c;
                int k = 0;
                boolean flags = true;
                do {
                    System.out.println("Bạn chọn làm gì?");
                    System.out.println("1.Nhập thông tin CD \n"
                            + "2.Xuất danh sách Album.\n" + "3.Tính tổng giá thành \n" + "4.Tổng số lượng CD \n"
                            + "5.Sắp xếp giảm dần theo giá thành\n" + "6.Sắp xếp tăng dần theo tựa CD\n" + "Nhập số khác để thoát");
                    c = sc.nextInt();
                    switch (c) {
                        case 1:
                            System.out.println("Nhập số lượng CD : ");
                            k = sc.nextInt();
                            alb = new Album[k];
                            for (int i = 0; i < k; i++) {
                                System.out.println("CD thứ " + (i + 1) + ": ");
                                alb[i] = new Album();
                                nhapAlbum(alb[i]);
                            }
                            break;
                        case 2:
                            System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Tên ca sỹ", "Số bài hát", "Giá thành");
                            for (int i = 0; i < k; i++) {
                                alb[i].hienThiAlbum();
                            }
                            break;
                        case 3:
                            int tong = 0;
                            for (int i = 0; i < k; i++) {
                                tong += alb[i].getGiaThanh();
                            }
                            System.out.println(""
                                    + "Tổng giá thành là : " + tong);
                            break;
                        case 4:
                            System.out.println("Tổng số lượng CD là : " + k);
                            break;
                        case 5:
                            Album temp = alb[0];
                            for (int i = 0; i < k - 1; i++) {
                                for (int j = i + 1; j < k; j++) {
                                    if (alb[i].getGiaThanh() < alb[j].getGiaThanh()) {
                                        temp = alb[j];
                                        alb[j] = alb[i];
                                        alb[i] = temp;
                                    }
                                }
                            }
                            System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                            break;
                        case 6:
                            temp = alb[0];
                            for (int i = 0; i < k - 1; i++) {
                                for (int j = i + 1; j < k; j++) {
                                    if (alb[i].getTenCD().compareTo(alb[j].getTenCD()) > 0) {
                                        temp = alb[j];
                                        alb[j] = alb[i];
                                        alb[i] = temp;
                                    }
                                }
                            }
                            System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                            break;
                        default:
                            System.out.println("Goodbye");
                            flags = false;
                            break;
                    }
                } while (flags);
                break;
        }

    }
}

