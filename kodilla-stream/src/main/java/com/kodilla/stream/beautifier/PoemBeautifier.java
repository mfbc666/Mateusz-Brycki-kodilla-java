package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, String textDecorate, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text, textDecorate);
        System.out.println(result);


    }
}
