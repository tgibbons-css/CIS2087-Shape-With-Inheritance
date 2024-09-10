package shapeinheritancesolution;

public class Triangle extends Shape
{
    @Override
    public void calculateArea()
    {
        area = height * width / 2;
    }
}
