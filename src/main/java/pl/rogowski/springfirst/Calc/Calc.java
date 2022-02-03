package pl.rogowski.springfirst.Calc;


import org.springframework.stereotype.Component;

import java.util.Random;
@Component

public class Calc {

    private  int a = 2;
    private int b = 4;
    private Random random;
    private int result;

    public Calc() {
        random = new Random();
    }

    public int calcRandom() {
       return random.nextInt(calcExample());
    }

    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }

    public int calcExample()
    {
        return a*b;
    }


    @Override
    public String toString() {
        return "<div id = 'bodyTemp'>Hello! Multiplied numbers: " + getA() + " and " + getB() + " gives result: " +
                calcExample() + "<br> Random example: " + calcRandom() + "</div>";
    }
}
