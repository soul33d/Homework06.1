package com.homelearning.behavioral.interpreter.expression;

public class PlusExpression extends NonTerminalExpression {

    public PlusExpression(Expression expressionA, Expression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public int interpret() {
        return expressionA.interpret() + expressionB.interpret();
    }
}
