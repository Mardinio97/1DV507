import java.text.DecimalFormat;

public abstract  class Shape {
    protected String name;

    public Shape(String shapeName) { name = shapeName; }



    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("##.00");
        String a = f.format( getArea() );
        String p = f.format( getPerimeter() );
        return name+", Area = "+a+", Perimeter = "+p;
    }
}

