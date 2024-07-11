public class Student {
    private int id;
    private String name;
    private static String college = "BBDIT";

    Student(int i, String n){
        id = i;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(id + " " + name + " " + college);
    }
}
