package Shape;

public class Rectangle extends Shape{
    private final double area;

    public Rectangle(int base, int height){
        area = base * height;
    }

    @Override
    public double area(){
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle(" + area + ")";
    }
}
