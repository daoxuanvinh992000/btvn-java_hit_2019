package battlefield;

import java.util.Scanner;

public class InforHuman {

    public Human n[];
    Scanner sc = new Scanner(System.in);

    public void Infut() {
        n = new Human[2];
        for (int i = 0; i < n.length; i++) {
            System.out.println("nhập thông tin người thư " + (i + 1) + "");
            n[i] = new Human();
            n[i].Infor();
        }
    }

    public void Output() {
        for (int i = 0; i < n.length; i++) {
            n[i].ShowInfo();
        }
    }

    public void Fight() {
        System.out.println("Người 1 đánh người 2: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Người 1 đánh người 2 lần " + (i + 1));
            n[1].HP = n[1].HP - n[0].Dame;
            if (n[1].HP < 0) {
                break;
            } else {
                n[0].ShowInfo();
                n[1].ShowInfo();
            }
        }
        System.out.println("Người 2 đánh người 1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Người 2 đánh người 1 lần " + (i + 1));
            n[0].HP = n[0].HP - n[1].Dame;
            if (n[0].HP < 0) {
                break;
            } else {
                n[0].ShowInfo();
                n[1].ShowInfo();
            }
        }
         System.out.println("Người chiến thắng: ");
        if (n[0].HP > n[1].HP) {
           n[0].ShowInfo();
        }
        if (n[0].HP < n[1].HP) {
           n[1].ShowInfo();
        }
        if (n[0].HP == n[1].HP) {
            System.out.println("Hòa");
        }

    }
}
