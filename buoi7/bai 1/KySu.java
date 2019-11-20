
package bai1;

import java.util.Scanner;

public class KySu extends Person {

    public String Nganh;
    public int NamTN;

    public KySu() {
    }

    
    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public int getNamTN() {
        return NamTN;
    }

    public void setNamTN(int NamTN) {
        this.NamTN = NamTN;
    }
    
    public void Info() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten ky su: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        NgaySinh = sc.nextLine();
        System.out.print("Nhap que quan: ");
        QueQuan = sc.nextLine();
        System.out.print("Nhap nganh hoc: ");
        Nganh = sc.nextLine();
        System.out.print("Nhap nam tot nghiep: ");
        NamTN = sc.nextInt();
    }

    public void Show() {
        System.out.println("Ho ten: " + HoTen);
        System.out.println("Ngay sinh: " + NgaySinh);
        System.out.println("Que quan: " + QueQuan);
        System.out.println("Nganh hoc: " + Nganh);
        System.out.println("Nam tot nghiep: " + NamTN);
    }
}
