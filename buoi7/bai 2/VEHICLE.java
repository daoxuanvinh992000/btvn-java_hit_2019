package run_main;

public class VEHICLE {

    public String NhanHieu;
    public int NamSX;
    public String Hang;

    public VEHICLE() {
    }

    public VEHICLE(String NhanHieu, int NamSX, String Hang) {
        this.NhanHieu = NhanHieu;
        this.NamSX = NamSX;
        this.Hang = Hang;
    }

    public String getNhanHieu() {
        return NhanHieu;
    }

    public void setNhanHieu(String NhanHieu) {
        this.NhanHieu = NhanHieu;
    }

    public int getNamSX() {
        return NamSX;
    }

    public void setNamSX(int NamSX) {
        this.NamSX = NamSX;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

}
