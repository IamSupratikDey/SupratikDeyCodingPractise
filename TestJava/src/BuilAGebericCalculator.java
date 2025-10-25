import java.util.*;


abstract class Shape {
    abstract  double area();

}

   class Circle extends Shape{

    public double radius;

    public Circle (double radius)
    {
        this.radius = radius;
    }
       @Override
       double area()
    {
       return Math.PI * radius * radius;
    }

    class ShapeUtils{
    public static double calculateTotalArea(List<? extends Shape> shapes)
    {

        double sum = 0;
        for (Shape s : shapes) {
            sum += s.area();
        }
        return sum;
    }
    }

}
public class BuilAGebericCalculator {

    public static void main(String[] args)
    {
       List<Circle> circle = Arrays.asList(new Circle(2.5), new Circle(3.0));
        System.out.println("Total area of circles: " + Circle.ShapeUtils.calculateTotalArea(circle));
    }
}


