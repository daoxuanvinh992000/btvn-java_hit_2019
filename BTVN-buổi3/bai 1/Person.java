package btvn;

public class Person {

    private String name;
    private int age;
    private String hobby;
    private String sex;

    public Person() {
    }

    public void getName() {
        System.out.println("tên la: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAge() {
        System.out.println("tuổi la: " + age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getHobby() {
        System.out.println("sở thích la: " + hobby);
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void getSex() {
        System.out.println("Giới tính la: " + sex);
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
