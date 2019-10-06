/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Btvn6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n1,m1;
       float n2,m2;
        System.out.println("nhap 2 so nguyen n1,m1 tu ban phim: ");
        n1=sc.nextInt();
        m1=sc.nextInt();
        System.out.println("nhap 2 so thuc n2,m2 tu ban phim : ");
        n2=sc.nextFloat();
        m2=sc.nextFloat();
        int a=n1+m1;
        float b=n2+m2;
        float c=(float) n1+n2;
        System.out.println("tong 2 so nguyen :"+a);
        System.out.println("tong 2 so thuc: "+b);
        System.out.println("tong n1+n2: "+c);
    }
    
}
