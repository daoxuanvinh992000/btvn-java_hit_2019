package caulacbo;

public class CauLacBo {

    private Leader a;
    private Support b;
    private Member c;

    public CauLacBo() {
    }

    public CauLacBo(Leader a, Support b, Member c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void ShowInfo() {
        a.Show();
        b.Show();
        c.Show();
    }
}
