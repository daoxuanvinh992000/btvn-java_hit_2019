package run;

import java.util.Scanner;

public class Nguoi {

    public String HoTen;
    public String NgaySinh;
    public String QueQuan;

    public Nguoi() {
    }

    public Nguoi(String HoTen, String NgaySinh, String QueQuan) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        HoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        NgaySinh = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        QueQuan = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Họ tên: " + HoTen + "\tNgày sinh: " + NgaySinh + "\tQuê quán: " + QueQuan + "");

    }
}
