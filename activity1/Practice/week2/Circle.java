package Practice.week2;

public class Circle {
    double radius;
    static final double PI = 3.1416;

    public Circle(){}

    public  Circle(double setRadius){
        radius = setRadius;
    }

    public double getArea(){
        double area = PI * radius * radius;
        return area;
    }


}
