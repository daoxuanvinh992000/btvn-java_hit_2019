package caulacbo;

public class RunMain {

    public static void main(String[] args) {
        String[] Tentv = {"thành", "vinh"};
        CauLacBo club = new CauLacBo(new Leader("Sơn", 21, 100), new Support("Thụ", 21, Tentv), new Member("vinh", 8, 0));
        club.ShowInfo();
    }

}
