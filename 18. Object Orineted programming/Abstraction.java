public class Abstraction {
    public static void main(String[] args) {
        shraddha s = new shraddha();
        s.name();
        s.age();
    }
}
abstract class jatin{
    void jatinname(){
        System.out.println("My name is Jatin Maurya");
    }
    abstract void age();
}

class shraddha extends jatin{
    void name(){
        System.out.println("My name is Shraddha");
    }
    void age(){
        System.out.println("My age is 23");
    }
}