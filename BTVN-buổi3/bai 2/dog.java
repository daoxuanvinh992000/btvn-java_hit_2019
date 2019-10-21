package btvn1;

import java.util.Scanner;

public class dog {

    private String name;
    private int MP = 100;

    public void InputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        name =sc.nextLine();
    }

    public void showMP() {
        System.out.println("mp đang có: " + MP);
    }

    public void Bark() {
        if (name.length() != 0) {
            System.out.println(name + " gâu gâu");
            MP = MP - 20;
        } else {
            System.out.println("ban chưa nhap ten");
        }
    }
}
