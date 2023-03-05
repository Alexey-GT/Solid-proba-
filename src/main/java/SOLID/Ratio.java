package SOLID;

public class Ratio  {
    double x;
    public Ratio(double x){
        this.x = x;
        Logger.logData("Рациональное число" + x + "создано");
    }

    public double getX() {
        return x;
    }
}

