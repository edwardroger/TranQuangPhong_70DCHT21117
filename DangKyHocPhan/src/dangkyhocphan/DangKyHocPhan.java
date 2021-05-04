/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangkyhocphan;

/**
 *
 * @author sgthu
 */
public class DangKyHocPhan {

    private String maHocPhan;
    private String tenHocPhan;
    private int soLuongMax;
    private int soLuongHienTai;

    public DangKyHocPhan() {
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.soLuongHienTai = soLuongHienTai;
        this.soLuongMax = soLuongMax;
    }

    public void DangKy() {
        System.out.println("Sinh vien dang ky hoc phan....");
        if (this.soLuongHienTai == 0) {
            System.out.println("Hoc phan %s chua dang ky la \n", this.tenHocPhan);
        } else {
            this.soLuongHienTai--;
            System.out.println("Da huy dang ky hoc phan %s thanh cong. \n", this.tenHocPhan);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

}
