package bai3;

import java.util.Scanner;

public class Student {
    Scanner sc =new Scanner(System.in);
    private String name;
    private String code;
    private int age;

    public Student() {
    }

    public Student(String name, String code, int age) {
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void InputInfo(){
        System.out.println("nhập tên sinh viên: ");
        name=sc.nextLine();
        System.out.println("nhập mã sinh viên: ");
        code=sc.nextLine();
        System.out.println("nhập tuổi: ");
        age=sc.nextInt();
    }
    public void ShowInfo(){
        System.out.println("tên: "+name+"\t mã sinh viên: "+code+"\t tuổi: "+age+"");
    }
}
