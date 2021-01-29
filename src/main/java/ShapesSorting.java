import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Shape.*;

public class ShapesSorting {
    public static void main(String args[]){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square( 2));
        shapes.add(new Circle(2));
        shapes.add(new Rectangle( 4, 2));
        shapes.add(new Triangle(1, 2));
        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.area(), o2.area());
            }
        });
        for(Shape str: shapes) {
            System.out.println(str.toString());
        }

    }
}
