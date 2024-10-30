public class RightAngle extends Shape {
    private double radius;

    public RightAngle() {
    }

    public RightAngle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "RightAngle{" +
                "radius: " + radius +
                '}';
    }
}

