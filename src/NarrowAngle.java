public class NarrowAngle extends Shape {
    private double length;
    private double width;

    public NarrowAngle() {
    }

    public NarrowAngle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "NarrowAngle{" +
                "length: " + length +
                " width: " + width +
                '}';
    }
}








