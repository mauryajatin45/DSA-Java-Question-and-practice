public class GetterAndsetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setName("Parkor");
        p1.getName();
        p1.setTip(5);
        p1.getTip();
    }
}

class Pen {
    private String name;
    private int tip;

    void setName(String name) {
        this.name = name;
    }

    void getName() {
        System.out.println(name);
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    void getTip() {
        System.out.println(tip);
    }
}