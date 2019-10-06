/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn10;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Btvn10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c,x, x1, x2, delta;
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Giải phương trình ax^2 + bx + c = 0");
         
    do {
        System.out.print("Nhập a: ");
        a = sc.nextDouble();
    } while (a == 0);
    System.out.print("Nhập b: ");
    b = sc.nextDouble();
    System.out.print("Nhập c: ");
    c = sc.nextDouble(); 
    // tính delta = b * b - 4 * a * c;
    delta = Math.pow(b, 2) - 4 * a * c;    
    // kiểm tra nếu delta < 0 thì phương trình vô nghiệm
    // delta = 0 thì phương trình có nghiệm kép
    // delta > 0 thì phương trình có 2 nghiệm phân biệt
    if (delta < 0) {
        System.out.println("Phương trình vô nghiệm");
    } else if (delta == 0) {
        x= x1 = x2 = -b/ (2*a);
        System.out.println("Phương trình có 2 nghiệm x1 =x2= " +x);
    } else {
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
       System.out.println("Phương trình có 2 nghiệm x1 = " +x1 + " và x2 = " +x2);
    }    

    }
    
}
