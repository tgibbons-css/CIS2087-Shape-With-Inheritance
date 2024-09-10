package shapeinheritancesolution;

public class Ellipse extends Shape
{
    @Override
    public void calculateArea()
    {
        area = Math.PI * (height / 2) * (width / 2);
    }
}
