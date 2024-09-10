package shapeinheritancesolution;

public abstract class Shape implements Comparable<Shape>
{
    protected double height;
    protected double width;
    protected double area;
    
    public Shape()
    {
        height = 0;
        width = 0;
        area = 0;
    }
    
    public void setHeight(double inHeight)
    {
        height = inHeight;
    }
    
    public void setWidth(double inWidth)
    {
        width = inWidth;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getArea(){
        return area;
    }
    
    public abstract void calculateArea();
    
    @Override
    public String toString()
    {
        return height + " height, " + width + " width, " + area + " area";
    }

    @Override
    public int compareTo(Shape other)
    {
        int value = 0;
        
        if (area < other.area)
        {
            value = -1;
        }
        else if (area > other.area)
        {
            value = 1;
        }
        
        return value;
    }
}
