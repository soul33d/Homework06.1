package com.homelearning.behavioral.interpreter.expression;

public class BracketsExpression implements Expression {

    private Expression expression;

    public BracketsExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int interpret() {
        return expression.interpret();
    }
}
