package run_main;

public class Run_main {

    public static void main(String[] args) {
        OTO oto = new OTO(4, 100, "Vinh", 2014, "Vinfast");
        oto.Show();
        MOTO moto = new MOTO("lon", "vinh", 2000, "Honda");
        moto.Show();
    }

}
