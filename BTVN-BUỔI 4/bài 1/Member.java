package run.main;

import java.util.Scanner;

public class Member {
    public String Ten;
    public String Lop;
    public int Msv;
    public int Tuoi;
    Scanner sc =new Scanner(System.in);
    public Member() {
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public int getMsv() {
        return Msv;
    }

    public void setMsv(int Msv) {
        this.Msv = Msv;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    public void InfoMember(){
        System.out.println("nhập tên sinh viên: ");
        Ten=sc.nextLine();
        System.out.println("Nhap ten lop:");
        Lop=sc.nextLine();
        System.out.println("nhập mã sinh viên: ");
        Msv=sc.nextInt();
        System.out.println("nhập tuổi: ");
        Tuoi=sc.nextInt();
    }
    public void ShowMember(){
        System.out.println("tên: "+Ten+"\t then lop: "+Lop+"\t mã sinh viên: "+Msv+"\t tuổi: "+Tuoi+"");
    }
}
