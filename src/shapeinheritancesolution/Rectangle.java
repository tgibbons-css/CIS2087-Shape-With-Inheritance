package shapeinheritancesolution;

public class Rectangle extends Shape
{
    @Override
    public void calculateArea()
    {
        area = height * width;
    }
}
