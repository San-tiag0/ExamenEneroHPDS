package Shape;

public class Circle extends Shape {

    private final double area;

    public Circle(int radius){
        area = radius * radius * Math.PI;
    }

    @Override
    public double area(){
        return area;
    }

    @Override
    public String toString() {
        return "Circle(" + area + ")";
    }
}
