package SOLID;

import java.util.Scanner;

public class Presenter {

    Calculator calculator;
    Scanner num = new Scanner(System.in);

    public Presenter() {

        this.calculator = new Calculator();
    }

    public void calculate() {
        System.out.println("Для выполнения вычислений с комплексными числами нажмите 1," +
                "с рациональными нажмите 2 ");
        switch (choice()) {
            case (1):
//                complexCalc.setX(view.getValue("Введите действительную часть первого комплексного числа: "));
//                complexCalc.setY(view.getValue("Введите действительную часть второго комплексного числа: "));
//                complexCalc.setA(view.getValue("Введите мнимую часть первого комплексного числа: "));
//                complexCalc.setB(view.getValue("Введите мнимую часть второго комплексного числа: "));
                System.out.println("введ дейст и мним час 1 комп числа");
                Complex complex1 = getComplex();
                System.out.println("введ дейст и мним час 2 комп числа");
                Complex complex2 = getComplex();


                        System.out.println("Выберите тип арифметической операции:\n" +
                                "1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление ");
                switch (choice()) {
                    case (1):
                       calculator.sum(complex1, complex2);
                        //System.out.println("Сумма чисел равна: " + complexCalc.sum());
                        break;
//                    case (2):
//                        complexCalc.difference();
//                        //System.out.println("Разность чисел равна: " + complexCalc.difference());
//                        break;
//                    case (3):
//                        complexCalc.mult();
//                        //System.out.println("Произведение чисел равно: " + complexCalc.mult());
//                        break;
//                    case (4):
//                        complexCalc.div();
//                        //System.out.println("Частное чисел равно: " + complexCalc.div());
//                        break;
                }
                break;
            case (2):
                System.out.println("введ  1 рац числа");
                Ratio ratio1 = getRatio();
                System.out.println("введ 2 рац числа");
                Ratio ratio2 = getRatio();
//                ratioCalc.setX(view.getValue("Введите первое число: "));
//                ratioCalc.setY(view.getValue("Введите второе число: "));

                System.out.println("Выберите тип арифметической операции:\n" +
                        "1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление ");
                switch (choice()) {
                    case (1):
                        calculator.sum(ratio1,ratio2);
                        //System.out.println("Сумма чисел равна: " + ratioCalc.sum());
                        break;
//                    case (2):
//                        ratioCalc.difference();
//                        //System.out.println("Разность чисел равна: " + ratioCalc.difference());
//                        break;
//                    case (3):
//                        ratioCalc.mult();
//                        //System.out.println("Произведение чисел равна: " + ratioCalc.mult());
//                        break;
//                    case (4):
//                        ratioCalc.div();
//                        //System.out.println("Частное чисел равна: " + ratioCalc.div());
//                        break;
                }
                break;
        }

    }

//    public double getValue(String title) {
//        System.out.println(title);
//        return num.nextDouble();
//    }

    public int choice() {
        return num.nextInt();
    }
    private Complex getComplex(){
        double x = num.nextDouble();
        double y = num.nextDouble();
        return new Complex(x,y);
    }
    private Ratio getRatio(){
        double x = num.nextDouble();
        return new Ratio(x);
    }
}