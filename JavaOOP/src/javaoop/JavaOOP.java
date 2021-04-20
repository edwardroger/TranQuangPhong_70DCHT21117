/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.util.Scanner;

/**
 *
 * @author sgthu
 */
public class JavaOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Bài tập Java buổi 1");
        System.out.println("1. Bài 1: Hình chữ nhật.");
        System.out.println("2. Bài 2: Danh sách sinh viên.");
        System.out.println("3. Bài 3: Xe máy.");
        System.out.println("4. Bài 5: Phân số.");

        System.out.println("\n=======================================================\n");

        a = input.nextInt();

//        ComplexNumber n = new ComplexNumber();
        switch (a) {
            case 1:
                HinhChuNhat hcn = new HinhChuNhat();
                Scanner scanner = new Scanner(System.in);
                //yêu cầu người dùng nhập vào chiều dài và chiều rộng
                System.out.println("nhập vào chiều dài : ");
                hcn.setDai(scanner.nextDouble());
                System.out.println("nhập vào chiều rộng : ");
                hcn.setRong(scanner.nextDouble());
                //gọi hàm tính chu vi và diện tích ở class HinhChuNhat bằng cách sử dụng object vừa mới được tạo là hcn
                System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
                System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
                System.out.println("----------------------end----------------------------");

                break;
            case 2:

                SinhVien sv1 = new SinhVien();
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập mã sinh viên 1: ");
                sv1.setMaSV(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhập tên sinh viên 1: ");
                sv1.setTenSV(sc.nextLine());
                System.out.println("Nhập điểm lý thuyết: ");
                sv1.setDiemTL(sc.nextFloat());
                System.out.println("Nhập điểm thực hành: ");
                sv1.setDiemTH(sc.nextFloat());

                //-------------------sinh viên 2----------------------
                SinhVien sv2 = new SinhVien();
                System.out.println("Nhập mã sinh viên 2: ");
                sv2.setMaSV(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhập tên sinh viên 2: ");
                sv2.setTenSV(sc.nextLine());
                System.out.println("Nhập điểm lý thuyết: ");
                sv2.setDiemTL(sc.nextFloat());
                System.out.println("Nhập điểm thực hành: ");
                sv2.setDiemTH(sc.nextFloat());

                //---------------------sinh viên 3------------------------
                SinhVien sv3 = new SinhVien();
                System.out.println("Nhập mã sinh viên 3: ");
                sv3.setMaSV(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhập tên sinh viên 3: ");
                sv3.setTenSV(sc.nextLine());
                System.out.println("Nhập điểm lý thuyết: ");
                sv3.setDiemTL(sc.nextFloat());
                System.out.println("Nhập điểm thực hành: ");
                sv3.setDiemTH(sc.nextFloat());

                //in theo format
                System.out.printf("%6s %10s %20s %10s %10s \n", "Mã sinh viên", "Họ tên", "Điểm lý thuyết", "Điểm thực hành", "Điểm trung bình");
                //gọi phương thức in đã được viết ở class SinhVien cho các sinh viên để hiển thị kết quả đã nhập
                sv1.inSV();
                sv2.inSV();
                sv3.inSV();
                System.out.println("--------------------------end-----------------------------");
                break;
            case 3:
                XeMay xe1 = new XeMay();
                Scanner nhap = new Scanner(System.in);
                System.out.println("Nhập tên chủ xe 1: ");
                xe1.setTenChuXe(nhap.nextLine());
                nhap.nextLine();
                System.out.println("Nhập tên loại xe: ");
                xe1.setTypeXe(nhap.nextLine());
                System.out.println("Nhập dung tích: ");
                xe1.setDungTich(nhap.nextInt());
                System.out.println("Nhập giá trị xe: ");
                xe1.setGiaTri(nhap.nextInt());

                //-------------------sinh viên 2----------------------
                XeMay xe2 = new XeMay();

                System.out.println("Nhập tên chủ xe 2: ");
                xe2.setTenChuXe(nhap.nextLine());
                nhap.nextLine();
                System.out.println("Nhập tên loại xe: ");
                xe2.setTypeXe(nhap.nextLine());
                System.out.println("Nhập dung tích: ");
                xe2.setDungTich(nhap.nextInt());
                System.out.println("Nhập giá trị xe: ");
                xe2.setGiaTri(nhap.nextInt());

                //---------------------sinh viên 3------------------------
                XeMay xe3 = new XeMay();

                System.out.println("Nhập tên chủ xe 3: ");
                xe3.setTenChuXe(nhap.nextLine());
                nhap.nextLine();
                System.out.println("Nhập tên loại xe: ");
                xe3.setTypeXe(nhap.nextLine());
                System.out.println("Nhập dung tích: ");
                xe3.setDungTich(nhap.nextInt());
                System.out.println("Nhập giá trị xe: ");
                xe3.setGiaTri(nhap.nextInt());

                //in theo format
                System.out.printf("%10s %10s %20s %10s %10s \n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế");
                System.out.printf("=================================================================================================\n");

                //gọi phương thức in đã được viết ở class SinhVien cho các sinh viên để hiển thị kết quả đã nhập
                xe1.inXe();
                xe2.inXe();
                xe3.inXe();
                System.out.println("--------------------------end-----------------------------");
                break;
            case 5:

                PhanSo phanSo1 = new PhanSo(16, 3);    // tạo phân số có tử = 16 và mẫu = 4
                PhanSo phanSo2 = new PhanSo(4, 8); // tạo phân số có tử = 4 và mẫu = 8

                // gọi phương thức cộng, trừ, nhân, chia 2 phân số
                phanSo1.congPhanSo(phanSo2);
                phanSo1.truPhanSo(phanSo2);
                phanSo1.nhanPhanSo(phanSo2);
                phanSo1.chiaPhanSo(phanSo2);

                break;

        }
    }

}
