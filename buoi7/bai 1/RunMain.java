package bai1;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong ky su: ");
        int n = sc.nextInt();
        KySu[] ks = new KySu[n];
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ky su thu " + (i + 1) + ":");
            ks[i] = new KySu();
            ks[i].Info();
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Ky su thu " + (i + 1) + ":");
            ks[i].Show();
        }
        int max = ks[0].NamTN;
        for (int i = 1; i < n; i++) {
            if (ks[i].NamTN > max) {
                max = ks[i].NamTN;
            }
        }
        System.out.println("\nCac ky su tot nghiep gan nhat");
        for (int i = 0; i < n; i++) {
            if (ks[i].NamTN == max) {
                ks[i].Show();
            }
        }
    }

}
