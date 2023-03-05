package SOLID;

public class Complex extends Ratio {
    double y;
    public Complex(double x, double y) {
        super(x);
        this.y = y;
        Logger.logData("Комплексное число" + x + " , " + y + "i создано ");
    }

    public double getY() {
        return y;
    }
}



