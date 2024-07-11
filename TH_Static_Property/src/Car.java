public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public void display(){
        System.out.println("ten xe la: " + name + " dong co la " + engine );
    }
}
