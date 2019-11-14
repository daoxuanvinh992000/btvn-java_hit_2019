package maytinh;

public class MayTinh {

    public static void main(String[] args) {
        TinhTong tt = new TinhTong();
        System.out.println("20+20.5= "+ tt.Tong(20, 20.5f));
         System.out.println("30+ 20 + 20.5= "+tt.Tong(30, 20, 25.50f));
        tt.Tong();
    }

}
