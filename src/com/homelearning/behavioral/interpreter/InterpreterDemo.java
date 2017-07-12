package com.homelearning.behavioral.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        String s = "(4+2*2)/2";
        Context context = new Context();
        System.out.println(context.evaluate(s).interpret());
    }
}
