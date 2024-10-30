public class Rectangle extends Shape{
    private double width;


    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double width) {
        this.width = width;

    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                "} " ;
    }
}

