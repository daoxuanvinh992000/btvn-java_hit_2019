
package battlefield;

import java.util.Scanner;

public class Human {

    public String name;
    public int HP;
    public int Dame;
    Scanner sc = new Scanner(System.in);

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDame() {
        return Dame;
    }

    public void setDame(int Dame) {
        this.Dame = Dame;
    }

    public void Infor() {
        System.out.println("Tên: ");
        name = sc.nextLine();
        System.out.println("HP: ");
        HP = sc.nextInt();
        System.out.println("Dame: ");
        Dame = sc.nextInt();
    }

    public void ShowInfo() {
        System.out.println("name=" + name + "\tHP=" + HP + "\tDame=" + Dame + "");
    }
}
