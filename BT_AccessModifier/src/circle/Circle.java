package circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

     double getRadius(){
        return radius;
    }

     double getArea(){
        double Pi = 3.14;
        return radius * radius * Pi;
    }
}
