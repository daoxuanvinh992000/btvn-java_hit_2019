package maytinh;

import java.util.Scanner;

public class TinhTong {

    int n;

    public float Tong(float a, float b) {
        float tong = a + b;
        return tong;     
    }

    public float Tong(float a, float b, float c) {
        float tong = a + b + c;
        return tong;
    }

    public void Tong() {
        float tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        n = sc.nextInt();
        float[] a = new float[n];
        System.out.println("nhap mang");
        for (int i = 0; i < n; i++) {
            System.out.println("NHAP a[" + i + "]= ");
            a[i] = sc.nextFloat();
        }
        for (int i = 0; i < n; i++) {
            tong = tong + a[i];
        }
        System.out.println("tong cac phan tu mang la: " + tong);

    }

}
