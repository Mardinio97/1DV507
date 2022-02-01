class Rectangle extends Shape {
    private final double base;
    private double height ;
    private  final  String q1;

    Rectangle(String q1,double base, double height) {
        super(q1);

        this.q1=q1;
        this.base = base;
        this.height = height;
    }


    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base+height);
    }
}
