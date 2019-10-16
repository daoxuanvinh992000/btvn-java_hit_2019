package btvn.pkg4;

import java.util.Scanner;
// DE BAI: MOT CHUOI DUOC GOI LA THAN THIEN KHI CO HELLO TRONG CHUOI
public class BTVN4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a[dem]) {
                dem++;
            }
        }
        if (dem == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
