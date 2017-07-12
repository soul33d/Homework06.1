package com.homelearning.behavioral.interpreter.expression;

public class MinusExpression extends NonTerminalExpression {

    public MinusExpression(Expression expressionA, Expression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public int interpret() {
        return expressionA.interpret() - expressionB.interpret();
    }
}
