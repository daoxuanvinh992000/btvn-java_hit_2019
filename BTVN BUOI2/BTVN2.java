package btvn2;

import java.util.Scanner;

public class BTVN2 {
//DE BAI: NHAP VAO 1 CHUOI BAT KY HIEN THI RA TONG CAC SO TRONG CHUOI
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int tong = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                     tong=tong+(s.charAt(i)-48);
            }
        }
         System.out.println("tong cac ky tu la so trong chuoi la: "+tong);
   
    }

}
