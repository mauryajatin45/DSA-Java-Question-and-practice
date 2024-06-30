public class Herirachical_inheritance {
    public static void main(String[] args) {
        derived1 d1 = new derived1();
        derived2 d2 = new derived2();
        d1.base();
        d1.derived1();
        d2.base();
        d2.derived2();
    }
}

class base {
    void base() {
        System.out.println("Hey! I am base class");
    }
}

class derived1 extends base {
    void derived1() {
        System.out.println("hey! I am derived1 class");
    }
}

class derived2 extends base {
    void derived2() {
        System.out.println("hey! I am derived2 class");
    }
}
