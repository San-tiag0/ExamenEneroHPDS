import org.junit.*;
import Shape.*;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Sorting_ {

    private ArrayList listAux;
    private ArrayList list1;
    private ArrayList list2;

    @Before
    public void init(){
        listAux = new ArrayList<>();
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }

    @After
    public void cleanLists(){
        list1.clear();
        list2.clear();
        listAux.clear();
    }
    @Test
    public void whenCorrectComparison(){
        listAux.add(new Circle(1));
        listAux.add(new Triangle(2,4));
        list1.add(new Triangle(2, 4));
        list1.add(new Circle(1));
        Collections.sort(list1, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.area(), o2.area());
            }
        });
        assertEquals(listAux, list1);
        listAux.clear();
        listAux.add(new Square(1));
        listAux.add(new Rectangle(2,1));
        list2.add(new Rectangle(2,1));
        list2.add(new Square(1));
        Collections.sort(list2, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.area(), o2.area());
            }
        });
        assertEquals(listAux, list2);
    }

    @Test
    public void whenIncorrectComparison(){
        listAux.add(new Triangle(2,4));
        listAux.add(new Circle(1));
        list1.add(new Triangle(2, 4));
        list1.add(new Circle(1));
        Collections.sort(list1, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.area(), o2.area());
            }
        });
        assertNotEquals(listAux, list1);

        listAux.clear();
        listAux.add(new Rectangle(2,1));
        listAux.add(new Square(1));
        list2.add(new Rectangle(2,1));
        list2.add(new Square(1));
        Collections.sort(list2, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.area(), o2.area());
            }
        });
        assertNotEquals(listAux, list2);
    }
}
