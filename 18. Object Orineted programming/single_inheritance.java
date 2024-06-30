public class single_inheritance {
    public static void main(String[] args) {
        fish f1 = new fish();
        f1.name();
        f1.weight();
        f1.fins();

    }
}

class Animal {
    void name() {
        System.out.println("This is the name of the Animal");
    }

    void weight() {
        System.out.println("my weight is xyz KG");
    }
}

class fish extends Animal {
    void fins() {
        System.out.println("This are fins of fish");
    }
}