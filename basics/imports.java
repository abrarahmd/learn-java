import java.util.Date;
import java.awt.Point;

public class MainClass {
    public static void main(String[] args) {
        // By 'new', allocating memory to Reference Variables
        // Example 1: Date
        Date today = new Date();
        System.out.println(today);

        // Example 2: Point
        Point point1 = new Point(10, 20);
        Point point2 = point1;
        point2.x = 100;
        System.out.println(point1);
        System.out.println(point2);
    }
}