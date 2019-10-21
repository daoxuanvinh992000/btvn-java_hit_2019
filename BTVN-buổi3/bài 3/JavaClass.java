package bai3;

import java.util.Scanner;

public class JavaClass {
    private Student stdList[];
    private int ratingStar;
    public String leader;
    Scanner sc =new Scanner(System.in);
    private void InputStudent(){
        System.out.println("nhap so luong sinh vien: ");
        int n=sc.nextInt();
        stdList =new Student[n];
        for(int i=0;i<n;i++)
        {
            stdList[i]= new Student();
            stdList[i].InputInfo();
        }
    }
    private void ShowStudent(){
        for(int i=0; i<stdList.length;i++)
        {
            stdList[i].ShowInfo();
        }
    }
    public void InputClassInfo(){
        System.out.println("nhập tên leader: ");
        leader =sc.nextLine();
        System.out.println("đánh giá ratingStar: ");
        ratingStar= sc.nextInt();
        InputStudent();
    }
    public void ShowClassInfo(){
        System.out.println("tên leader la: "+leader);
        System.out.println("đánh giá: "+ratingStar);
        ShowStudent();
    }
}
