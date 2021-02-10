// https://github.com/jbloch/effective-java-3e-source-code/blob/master/src/effectivejava/chapter7/item42/Operation.java
package com.mycompany.lambdasandstreams;

import java.util.Comparator;
import java.util.function.DoubleBinaryOperator;

// Enum with function object fields & constant-specific behavior (Page 195)
public enum OperationWithLambda {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y),
    YOLO("#",  new DoubleBinaryOperator(){
        @Override
        public double applyAsDouble(double left, double right) {
            return (left + right)*3.14;
        }

    });


    private final String symbol;
    private final DoubleBinaryOperator op;

    OperationWithLambda(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y) {
        //  use breakpoint here to see we enter in lambda
        // be careful to not use Operation class but OperationWithLambda
        return op.applyAsDouble(x, y);
    }

    // Main method from Item 34 (Page 163)
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        for (OperationWithLambda op : OperationWithLambda.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));

        // See https://www.geeksforgeeks.org/java-util-function-doublebinaryoperator-interface-with-examples/
        // Also to use enum
        // https://stackoverflow.com/questions/37409802/how-to-instantiate-java-enum
        OperationWithLambda op = OperationWithLambda.PLUS;
        // here it calls the OperationWithLambda constructor
        System.out.println(op.apply(3, 4));
        // we can use debugger and set breakpoint in apply to see how it is working

        // Finally to well understand return type of the lambda I added a YOLO operator with an anonymous class
        OperationWithLambda op2 = OperationWithLambda.YOLO;
        System.out.println("yolo " + op2.apply(3, 4));


    }
}
