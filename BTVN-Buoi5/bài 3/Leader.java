package caulacbo;

public class Leader {

    public String name;
    public int age;
    public int songaylanhdao;

    public Leader(String name, int age, int songaylanhdao) {
        this.name = name;
        this.age = age;
        this.songaylanhdao = songaylanhdao;
    }

    public void Show() {
        System.out.println("Tên leader: " + name + "\t Tuổi: " + age + "\t Số ngày lãnh đạo: " + songaylanhdao + "");
    }
}
