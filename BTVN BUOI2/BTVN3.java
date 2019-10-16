package btvn3;

import java.util.Scanner;
//HIEN THI MENU VOI CAC NOI DUNG:1. NHAP MANG 2. XUAT MANG 3. THEM PHAN TU 4. XOA PHAN TU 5. DAO MANG 6.DUA RA a[1]VA CAC SO CHIA HET CHO a[1]
public class BTVN3 {

    public static void nhapmang(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tNHAP MANG\n");
        for (int i = 0; i < n; i++) {
            System.out.println("nhap a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatmang(int a[], int n) {
        System.out.println("\n\t\tXUAT MANG\n");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }

    }

    public static void them(int a[], int x, int vt) {
        for (int i = a.length - 1; i >= vt; i--) {
            a[i] = a[i - 1];
        }
        a[vt - 1] = x;
        System.out.println("\tMANG SAU KHI CHEN");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }

    }

    public static void xoa(int a[], int n, int k) {
        for (int i = k - 1; i < n; i++) {
            a[i] = a[i + 1];
        }
        System.out.println("\tMANG SAU KHI XOA");
        for (int i = 0; i < n - 1; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }

    }

    public static void daomang(int a[], int n) {
        System.out.println("MANG SAU KHI DAO NGUOC LA");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }

    public static void hienthi(int a[]) {
        int dem = 0;
        System.out.println("a[1]= " + a[1]);
        System.out.println("cac so chia het cho a[1]");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % a[1] == 0 && a[i] != a[1]) {
                dem++;
                System.out.println("\n" + a[i]);
            }
        }
        if (dem == 0) {
            System.out.println("khong co phan tu nao chia het cho a[1]");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, chon;
        do {
            System.out.println("\tNHAP n: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("\tNHAP LAI");
            }
        } while (n < 0);
        int[] a = new int[n + 1];
        do {
            System.out.println("\n\t\t1- nhap mang");
            System.out.println("\n\t\t2- xuat mang");
            System.out.println("\n\t\t3-chen phan tu x vao vi tri k cua mang");
            System.out.println("\n\t\t4-xoa phan tu tai vi tri k cua mang");
            System.out.println("\n\t\t5-dao nguoc mang");
            System.out.println("\n\t\t 6-HIEN THI a[1] VA CAC SO CHIA HET CHO a[1]");
            System.out.println("\tNHAP LUA CHON");
            chon = sc.nextInt();
            switch (chon) {
                case 1:

                    nhapmang(a, n);
                    break;
                case 2:
                    xuatmang(a, n);
                    break;
                case 3:
                    System.out.println("\tNHAP GIA TRI CAN CHEN");
                    int x = sc.nextInt();
                    System.out.println("\tNHAP VI TRI CAN CHEN");
                    int vt = sc.nextInt();
                    them(a, x, vt);
                    break;
                case 4:
                    System.out.println("\tNHAP VI TRI MUON XOA");
                    int k = sc.nextInt();
                    xoa(a, n, k);
                    break;
                case 5:
                    daomang(a, n);
                    break;
                case 6:
                    hienthi(a);
                    break;
                case 7:
                    break;
            }
        } while (chon != 7);

    }

}
