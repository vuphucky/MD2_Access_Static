// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3", "Skyactiv 3");
        System.out.println("loai xe thu: " + Car.numberOfCar);
        car1.display();
        Car car2 = new Car("mazda 6", "Skyactiv 6");
        System.out.println("Loai xe thu: " + Car.numberOfCar);
        car2.display();
    }
}