public class First {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Setname("Blue");
        p1.Settip(5);
        System.out.println(p1.name);
        System.out.println(p1.tip);
    }
}

class Pen {
    String name;
    int tip;

    void Setname(String newname) {
        name = newname;
    }

    void Settip(int newtip) {
        tip = newtip;
    }
}
