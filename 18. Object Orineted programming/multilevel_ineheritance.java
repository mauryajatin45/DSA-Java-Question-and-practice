public class multilevel_ineheritance {
    public static void main(String[] args) {
        a3 objA3 = new a3();
        objA3.first();
        objA3.second();
        objA3.third();
    }
}

class a1 {
    void first() {
        System.out.println("I am first class");
    }
}

class a2 extends a1 {
    void second() {
        System.out.println("I am second class");
    }
}

class a3 extends a2 {
    void third() {
        System.out.println("I am third class");
    }
}
