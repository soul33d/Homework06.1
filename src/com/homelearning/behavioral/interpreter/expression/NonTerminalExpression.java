package com.homelearning.behavioral.interpreter.expression;

public abstract class NonTerminalExpression implements Expression {
    protected Expression expressionA;
    protected Expression expressionB;

    public NonTerminalExpression(Expression expressionA, Expression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }
}
