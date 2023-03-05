package SOLID;

public class Calculator  implements Model {

    @Override
    public Ratio sum(<? extends Ratio> x,<? extends Ratio> y) {

        if (x.getClass().getName().equals("Complex")) {
            System.out.println("Результат сложения комплексных чисел ");
            System.out.printf("%f + i%f%n",((Complex) x).getX() + ((Complex) x).getY(),
                    ((Complex) y).getX() + ((Complex) y).getY());
        }else {
            System.out.println("Результат сложения рац чисел ");
            System.out.println( x.getX() + y.getX());

        }
        return null;
    }

//    @Override
//    public T mult(T x,T y) {
////        Logger.logData("Произведение комплексных чисел: ");
////        return new Complex((x * a - y * b), (y * a + x * b));
//        return null;
//    }
//
//
//    @Override
//    public T div(T x,T y) {
////        Logger.logData("Частное комплексных чисел: ");
////        return new Complex((x * a + y * b) / (y * y + b * b), (y * a - x * b) / (y * y + b * b));
//        return null;
//    }
//
//    @Override
//    public T difference(T x,T y) {
////        Logger.logData("Разность комплексных чисел: ");
////        return new Complex(x - a, y - b);
//        return null;
//    }
}
