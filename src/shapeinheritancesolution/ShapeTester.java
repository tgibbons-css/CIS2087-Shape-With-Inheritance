package shapeinheritancesolution;

public class ShapeTester
{
    public static void main(String args[])
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3);
        rectangle.setHeight(4);
        rectangle.calculateArea();

        Triangle triangle = new Triangle();
        triangle.setWidth(3);
        triangle.setHeight(4);
        triangle.calculateArea();
    
        if (rectangle.compareTo(triangle) < 0)
        {
            System.out.println("The rectangle is less than the triangle.");
        }
        else if (rectangle.compareTo(triangle) == 0)
        {
            System.out.println("The rectangle is equal to the triangle.");
        }
        else
        {
            System.out.println("The rectangle is greater than the triangle.");
        }
    }
}
