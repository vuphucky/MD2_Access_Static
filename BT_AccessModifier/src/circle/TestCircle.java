package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(6.0);

        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());

        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
    }
}
