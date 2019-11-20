package run_main;

public class OTO extends VEHICLE {

    private int SoChoNgoi;
    private int DungTich;

    public OTO() {
    }

    public OTO(int SoChoNgoi, int DungTich, String NhanHieu, int NamSX, String Hang) {
        super(NhanHieu, NamSX, Hang);
        this.SoChoNgoi = SoChoNgoi;
        this.DungTich = DungTich;
    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int SoChoNgoi) {
        this.SoChoNgoi = SoChoNgoi;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }

    public void Show() {
        System.out.println("So cho ngoi: " + SoChoNgoi + "\t Dung tich: " + DungTich + "\t NhanHieu: " + NhanHieu + "\t Nam san xuat: " + NamSX + "\t Hang xe: " + Hang + "");
    }

}
