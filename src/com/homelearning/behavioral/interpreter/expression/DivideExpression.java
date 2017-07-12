package com.homelearning.behavioral.interpreter.expression;

public class DivideExpression extends NonTerminalExpression {

    public DivideExpression(Expression expressionA, Expression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public int interpret() {
        return expressionA.interpret()/expressionB.interpret();
    }
}
