package org.example.lambda.calculator;

public class CalculatorImpl {
    public static void main(String[] args) {

//        ICalculator calculator = () -> System.out.println("Switch on!");
//        calculator.switchOn();

//        ICalculator calculator = (value -> System.out.println("Value: " + value));
//        calculator.printNumber(25);

        ICalculator calculator = (x, y) -> {
            if (x > y) {
                throw new RuntimeException("Message");
            } else {
                return y - x;
            }

        };
        int result = calculator.substract(5, 7);
        System.out.println(result);
    }
}
