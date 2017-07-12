package com.homelearning.behavioral.interpreter.expression;

public class MultiplyExpression extends NonTerminalExpression {

    public MultiplyExpression(Expression expressionA, Expression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public int interpret() {
        return expressionA.interpret()*expressionB.interpret();
    }
}
