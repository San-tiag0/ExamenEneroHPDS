package Shape;

public class Triangle extends Shape{
    private final double area;

    public Triangle(int base, int height){
        area = base * height;
    }

    @Override
    public double area(){
        return area;
    }

    @Override
    public String toString() {
        return "Triangle(" + area + ")";
    }
}
