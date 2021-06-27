package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {




        Shapes triangle = new Triangle();
        triangle.draw();

        Shapes circle = new Circle();
        circle.draw();

        Shapes square = new Square();
        square.draw();


        List<Shapes> shapeslist = new ArrayList<>();
        shapeslist.add(triangle);
        shapeslist.add(new Triangle());
        shapeslist.add(new Square());
        shapeslist.add(new Square());
        shapeslist.add(circle);
        shapeslist.add(new Circle());
        shapeslist.add(new Circle());

        for (Shapes each :shapeslist) {
            each.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
    }

    /**
     * static method: draw shapes
     * accepts object of shapes
     * then calls draw method
     */

    public static void drawShape(Shapes shape) {
        shape.draw();

    }


}
