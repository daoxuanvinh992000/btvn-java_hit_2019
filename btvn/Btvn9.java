/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn9;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Btvn9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a, b;
        double x;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Nhập vào số a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        b = sc.nextInt();
        System.out.println("Phương trình vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            x = (double) -b / a;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(x));
        }
    }
    
}
