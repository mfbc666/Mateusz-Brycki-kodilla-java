package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {
        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5,(a, b) -> a + b );
        expressionExecutor.executeExpression(10,5,(a, b) -> a - b );
        expressionExecutor.executeExpression(10,5,(a, b) -> a * b );
        expressionExecutor.executeExpression(10,5,(a, b) -> a / b );
        expressionExecutor.executeExpression(10,5, (a, b) -> a +b);
        expressionExecutor.executeExpression(10,5,

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::subBFromA);
        */

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("TEKST DO ZMNIEJSZENIA", txt -> txt.toLowerCase());
        poemBeautifier.beautify("tekst do powiększenia", txt -> txt.toUpperCase());
        poemBeautifier.beautify("test", txt ->"!!! " + txt + " !!!" ) ;




    }
}
