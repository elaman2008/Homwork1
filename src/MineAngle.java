public class MineAngle extends Shape {
    private double jakA;
    private double jakB;
    private double jakC;

    public MineAngle(double jakA, double jakB, double jakC) {
        this.jakA = jakA;
        this.jakB = jakB;
        this.jakC = jakC;
    }

    public double getJakA() {
        return jakA;
    }

    public void setJakA(double jakA) {
        this.jakA = jakA;
    }

    public double getJakB() {
        return jakB;
    }

    public void setJakB(double jakB) {
        this.jakB = jakB;
    }

    public double getJakC() {
        return jakC;
    }

    public void setJakC(double jakC) {
        this.jakC = jakC;
    }

    @Override
    public double getPerimeter() {
        return jakA + jakB + jakC;
    }

    @Override
    public String toString() {
        return "MineAngle{" +
                "jakA: " + jakA +
                "jakB: " + jakB +
                "jakC: " + jakC +
                '}';
    }
}

