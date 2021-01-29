package Shape;

public class Square extends Shape{
    private final double area;

    public Square(int side){
        area = side * side;
    }

    @Override
    public double area(){
        return area;
    }

    @Override
    public String toString() {
        return "Square(" + area + ")";
    }
}
