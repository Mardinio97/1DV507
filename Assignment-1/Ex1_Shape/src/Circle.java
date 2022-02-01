public class Circle extends Shape{
    private final double radius;

    final double pi = Math.PI;

    public Circle(String name,double radius) {
        super(name);
        this.radius = radius;
        this.name=name;

    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}