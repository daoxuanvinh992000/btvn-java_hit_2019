package btvn1;

import java.util.Scanner;

public class BTVN1 {
// NHAP VAO N SO NGUYEN HIEN THI RA SO LON THU 3 TRONG MANG

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        System.out.println("\n\t\t NHAP MANG");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("\n\tphan tu lon thu 3 la");
        for (int i = 0; i < a.length; i++) {
            System.out.println(+a[2]);
            break;
        }
    }

}
