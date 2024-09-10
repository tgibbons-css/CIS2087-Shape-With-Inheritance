package shapeinheritancesolution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShapeInheritanceSolution
{
    public static final int TRIANGLE = 1;
    public static final int RECTANGLE = 2;
    public static final int ELLIPSE = 3;
    public static final int CIRCLE = 4;
    
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Scanner input = new Scanner(System.in);
        int shapeType;
        int height;
        int width;
        Shape shape;
        String playAgain;
        
        do
        {
            System.out.println("What kind of shape would you like to create? ");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Ellipse");
            System.out.println("4. Circle");
            System.out.print("> ");
            shapeType = input.nextInt();
            
            System.out.print("What is the height? ");
            height = input.nextInt();
            
            System.out.print("What is the width? ");
            width = input.nextInt();
            
            if(shapeType == TRIANGLE)
            {
                shape = new Triangle();
                /*
                Triangle triangle = new Triangle();
                triangle.setHeight(height);
                triangle.setWidth(width);
                shapes.add(triangle);
                */
            }
            else if(shapeType == RECTANGLE)
            {
                shape = new Rectangle();
            }
            else if (shapeType == ELLIPSE)
            {
                shape = new Ellipse();
            }
            else
            {
                shape = new Circle();
            }
            
            shape.setHeight(height);
            shape.setWidth(width);
            shapes.add(shape);
            
            System.out.print("Do you want to create another shape? ");
            playAgain = input.next();
            System.out.println();
        } while (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y"));
        
        for(int index = 0; index < shapes.size(); index++)
        {
            shape = shapes.get(index);
            shape.calculateArea();
        }
        
        System.out.println("Here are your unsorted shapes:");
        for(int index = 0; index < shapes.size(); index++)
        {
            shape = shapes.get(index);
            System.out.println(shape);
        }
        
        Collections.sort(shapes);
        
        System.out.println("Here are your sorted shapes:");
        for(int index = 0; index < shapes.size(); index++)
        {
            shape = shapes.get(index);
            System.out.println(shape);
        }
    }
}
