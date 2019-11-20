package run;

import java.util.Scanner;

public class SinhVien extends Nguoi {

    public String MSV;
    public String Nganh;
    public int KhoaHoc;

    public SinhVien() {
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public int getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(int KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhập mã sinh viên: ");
        MSV = sc.nextLine();
        System.out.print("Nhập ngành học: ");
        Nganh = sc.nextLine();
        System.out.print("Nhập khóa học: ");
        KhoaHoc = sc.nextInt();
    }

    public void Xuat() {
        super.Xuat();
        System.out.println("Mã sinh viên: " + MSV + "\tNgành học: " + Nganh + "\tKhóa học: " + KhoaHoc + "");
    }
}
