package run_main;

public class MOTO extends VEHICLE {

    private String PhanKhoi;

    public MOTO() {
    }

    public MOTO(String PhanKhoi, String NhanHieu, int NamSX, String Hang) {
        super(NhanHieu, NamSX, Hang);
        this.PhanKhoi = PhanKhoi;
    }

    public String getPhanKhoi() {
        return PhanKhoi;
    }

    public void setPhanKhoi(String PhanKhoi) {
        this.PhanKhoi = PhanKhoi;
    }

    public void Show() {
        System.out.println("Phan khoi: " + PhanKhoi + "\t NhanHieu: " + NhanHieu + "\t Nam san xuat: " + NamSX + "\t Hang xe: " + Hang + "");
    }
}
