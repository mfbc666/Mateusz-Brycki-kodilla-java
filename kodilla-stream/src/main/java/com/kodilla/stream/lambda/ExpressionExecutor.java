package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public void executeExpression(double a, double b, MathExpression mathExpression){
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("result equals" + result);
    }

    public void showExpression(double a, double b, MathExpression mathExpression){
        double resultShow = mathExpression.calculateExpression(a,b);
    }

}
