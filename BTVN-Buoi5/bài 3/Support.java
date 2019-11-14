package caulacbo;

public class Support {

    private String ten;
    private int tuoi;
    private String[] TenTv;

    public Support() {
    }

    public Support(String ten, int tuoi, String[] TenTv) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.TenTv = TenTv;
    }

    public void Show() {
        System.out.print("Tên support: " + ten);
        System.out.print("\tTuổi: " + tuoi);
        System.out.print("\nTên các thành viên trong nhóm: ");
        for (int i = 0; i < TenTv.length; i++) {
            System.out.print("\t\nThành viên thứ " + (i + 1) + ": " + TenTv[i]);
        }
    }
}
