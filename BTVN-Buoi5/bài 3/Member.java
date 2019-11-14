package caulacbo;

public class Member {

    private String ten;
    private int ngayHoatDong;
    private int soNgayNghi;

    public Member() {
    }

    public Member(String ten, int ngayHoatDong, int soNgayNghi) {
        this.ten = ten;
        this.ngayHoatDong = ngayHoatDong;
        this.soNgayNghi = soNgayNghi;
    }

    public void Show() {
        System.out.println("\nTên: " + ten + "\tNgày hoạt động: " + ngayHoatDong + "\tSố ngày nghỉ: " + soNgayNghi + "");
    }
}
