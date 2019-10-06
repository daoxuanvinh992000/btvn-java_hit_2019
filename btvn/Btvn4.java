/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.pkg4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Btvn4 {

    /**
     * @param args the command line arguments
     */
    public static void chuoi() {
          String s;
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("chuoi vua nhap :"+s);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen n: ");
        int n=sc.nextInt();
        System.out.println("so nguyen vua nhap la: "+n);
        System.out.println("nhap so thuc m: ");
        float m=sc.nextFloat();
        System.out.println("so thuc vua nhap la: "+m);
      chuoi();
    }
}
        
    

