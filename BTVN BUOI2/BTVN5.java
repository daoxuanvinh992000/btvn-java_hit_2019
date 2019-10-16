package btvn.pkg5;

import java.math.BigInteger;
import java.util.Scanner;
//tinh tong 2 so lon bat ki
public class BTVN5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        String a = scanner.nextLine();
        System.out.print("Nhập b: ");
        String b = scanner.nextLine();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger tong = A.add(B);
        System.out.println("" + a + "+" + b + "=" + tong);
    }

}
