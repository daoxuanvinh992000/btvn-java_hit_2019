/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn8;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Btvn8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
       float n,m,z;
        System.out.println("nhap n,m,z tu ban phim: ");
        n=sc.nextFloat();
        m=sc.nextFloat();
        z=sc.nextFloat();
        System.out.println("gia tri max:");
        System.out.println(Math.max(Math.max(n, m), z));
         System.out.println("gia tri min:");
         System.out.println(Math.min(Math.min(n, m), z));
    }
    
}
