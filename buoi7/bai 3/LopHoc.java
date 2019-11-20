package run;

import java.util.Scanner;

public class LopHoc {

    public String MaLH;
    public String TenLH;
    public String NgayMo;
    public SinhVien[] x;
    public String GiaoVien;
    public int n;

    public LopHoc() {
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String TenLH) {
        this.TenLH = TenLH;
    }

    public String getNgayMo() {
        return NgayMo;
    }

    public void setNgayMo(String NgayMo) {
        this.NgayMo = NgayMo;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(String GiaoVien) {
        this.GiaoVien = GiaoVien;
    }

    public void InforClass() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã lớp học: ");
        MaLH = sc.nextLine();
        System.out.print("Nhập tên lớp học: ");
        TenLH = sc.nextLine();
        System.out.print("Nhập ngày mở: ");
        NgayMo = sc.nextLine();
        System.out.print("Nhập giáo viên: ");
        GiaoVien = sc.nextLine();
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        x = new SinhVien[n];
        System.out.println("\tNhập thông tin sinh viên");
        for (int i = 0; i < n; i++) {
            x[i] = new SinhVien();
            System.out.println("Nhập sinh viên thứ " + (i + 1) + ":");
            x[i].Nhap();
        }
    }

    public void Show() {
        System.out.println("\tThông tin lớp học");
        System.out.println("Mã lớp học: " + MaLH + "\tTên lớp học: " + TenLH + "\tNgày mở: " + NgayMo + "\tGiáo viên: " + GiaoVien + "");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            x[i].Xuat();
        }
    }

    public void SvKhoa11() {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (x[i].KhoaHoc == 11) {
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("\t\nLop ko có sinh vien nào khóa 11");
        } else {
            System.out.println("\t\nLop có " + dem + " sinh vien khóa 11");
        }
    }

    public void sapxep() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x[i].KhoaHoc < x[j].KhoaHoc) {
                    int temp = x[j].KhoaHoc;
                    x[j].KhoaHoc = x[i].KhoaHoc;
                    x[i].KhoaHoc = temp;
                }
            }
        }
        Show();
    }
}
