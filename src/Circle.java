public class Circle extends Shape {
    private double Volume;


    public Circle() {
    }

    public Circle(double volume) {
        this.Volume = volume;
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        this.Volume = volume;

    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Volume;
    }

    @Override
    public String toString() {
        return "Circle{"+
                "volume=" + Volume +
                "} ";
    }
}