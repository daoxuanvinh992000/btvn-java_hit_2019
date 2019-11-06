package bai_2;

import java.util.Scanner;

public class Knight {
    public String name;
    public int HP;
    public int MP;
    Scanner sc =new Scanner(System.in);

    public Knight() {
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

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }
    public void Infor(){
        System.out.println("Nhập tên nhân vật");
        name=sc.nextLine();
        System.out.println("Nhập lượng máu ban đầu cho nv");
        HP=sc.nextInt();
        System.out.println("Nhập năng lượng");
        MP=sc.nextInt();
    }
    public void Heal(){
        do{
            HP=HP+30;
            MP=MP-50;
            System.out.println("\tHP VA MP SAU KHI SU DUNG");
            System.out.println("HP đang có: "+HP);
            System.out.println("MP đang có: "+MP);
        }while(MP>50);
    }
}
