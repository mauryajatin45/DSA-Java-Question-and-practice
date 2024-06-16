public class array_as_func {

    public static void update(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }

    }

    public static void main(String args[]) {
        int marks[] = { 97, 56, 86 };

        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks  = " + marks[i]);
        }
    }
}
