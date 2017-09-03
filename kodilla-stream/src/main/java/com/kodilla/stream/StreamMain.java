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

        poemBeautifier.beautify("Poniedziałek.", " Ale już po 17!",(text, textDecorate) -> text + textDecorate );
        poemBeautifier.beautify("Ala ma kota",".",(text, textDecorate) -> text + textDecorate);
        poemBeautifier.beautify("TowoT","!!!",(text, textDecorate) ->  textDecorate + text + textDecorate);
        poemBeautifier.beautify("smallletters"," bigletters",(text, textDecorate) ->   text + textDecorate.toUpperCase());


    }
}
