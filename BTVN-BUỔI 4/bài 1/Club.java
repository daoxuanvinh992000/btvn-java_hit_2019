package run.main;

import java.util.Scanner;

public class Club {
    public Member n[];
    Scanner sc=new Scanner(System.in);
    public void InfoMemberClub(){
        System.out.println("Nhap so thanh vien club: ");
        int SoLuong =sc.nextInt();
        n = new Member[SoLuong];
        for(int i=0; i<n.length;i++){
            System.out.print("\n\tNHAP THANH VIEN THU "+(i+1)+"\n");
            n[i]=new Member();
            n[i].InfoMember();
        }
    }
    public void ShowMemberClub(){
        System.out.println("thanh vien club:");
        for(int i=0; i<n.length;i++)
        {
            n[i].ShowMember();
        }
    }
}
