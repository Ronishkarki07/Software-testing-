package Workshop;

public class Rectangles extends Shape {

    private double length;
    private double width;

    public Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

