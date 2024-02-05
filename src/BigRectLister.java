// Got rectangle code from stack overflow
import java.awt.*;
import java.util.ArrayList;

public static void main(String[] args) {
    ArrayList<Rectangle> rectangles = new ArrayList<>();
    rectangles.add(new Rectangle(2, 3)); // perimeter: 10
    rectangles.add(new Rectangle(3, 1)); // perimeter: 8
    rectangles.add(new Rectangle(5, 1)); // perimeter: 12
    rectangles.add(new Rectangle(6, 1)); // perimeter: 14
    rectangles.add(new Rectangle(2, 2)); // perimeter: 8
    rectangles.add(new Rectangle(2, 2)); // perimeter: 8
    rectangles.add(new Rectangle(1, 5)); // perimeter: 12
    rectangles.add(new Rectangle(1, 2)); // perimeter: 6
    rectangles.add(new Rectangle(3, 5)); // perimeter: 16
    rectangles.add(new Rectangle(4, 4)); // perimeter: 16

    BigRectangleFilter bigRectangleFilter = new BigRectangleFilter();
    ArrayList<Object> bigRectangles = Interfaces.collectAll(rectangles.toArray(), bigRectangleFilter);
    System.out.println("Big rectangles: " + bigRectangles);
}
