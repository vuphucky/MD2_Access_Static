package student;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student();

        System.out.println(st1.getName());
        System.out.println("thay doi john:");
        st1.setName("toi la ai");
        System.out.println(st1.getName());

        System.out.println(st1.getClss());
        System.out.println("thay doi lop:");
        st1.setClss("C0524I1");
        System.out.println(st1.getClss());

        System.out.println("chi co private la ko the truy cap!");
    }
}
