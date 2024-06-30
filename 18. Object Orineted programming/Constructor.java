public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Jatin", 1);
    }
}

class Student {
    String name;
    int Rno;

    Student(String name, int Rno) {
        System.out.println("My name is " + (this.name = name));
        System.out.println("My Roll No. is " + (this.Rno = Rno));
    }
}