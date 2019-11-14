package conheo;

public class Conheo {
    String name;
    int weight;
    int age;

    public Conheo() {
    }

    public Conheo(String name) {
        this.name = name;
    }

    public Conheo(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Conheo(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Conheo(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }
    public void hienthi(){
         System.out.println("Tên: "+name+"\t Cân nặng:"+weight+"kg \tTuổi: "+age+"");
    }
    public static void main(String[] args) {
        Conheo x = new Conheo();
        x.hienthi();
        Conheo y= new Conheo("vinh");
        y.hienthi();
        Conheo z= new Conheo("vinh", 30);
        z.hienthi();
        Conheo t =new Conheo(30, 20);
        t.hienthi();
        Conheo o =new Conheo("vinh", 65, 20);
        o.hienthi();
    }

}
