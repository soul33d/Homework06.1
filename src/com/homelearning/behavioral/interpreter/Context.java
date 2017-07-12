package com.homelearning.behavioral.interpreter;

import com.homelearning.behavioral.interpreter.expression.*;
import org.jetbrains.annotations.NotNull;

import static java.lang.Character.*;
import static java.lang.Integer.*;

public class Context {

    private static final String OPENED_BRACKET = "(";
    private static final String CLOSED_BRACKET = ")";
    private static final String MULTIPLY_SIGN = "*";
    private static final String DIVIDE_SIGN = "/";

    public Expression evaluate(String s){
        bracketsCheck(s);
        if (s.contains(OPENED_BRACKET)){
            int openBracketIndex = s.indexOf(OPENED_BRACKET);
            int closeBracketIndex = s.indexOf(CLOSED_BRACKET);
            int bracketsResult = new BracketsExpression
                    (evaluate(s.substring(openBracketIndex + 1, closeBracketIndex))).interpret();
            s = s.substring(0, openBracketIndex) + bracketsResult + s.substring(closeBracketIndex + 1, s.length());
        }

        prioritySignArgumentCheck(s, MULTIPLY_SIGN);
        s = calculateHigherPriorityExpression(s, MULTIPLY_SIGN);
        s = calculateHigherPriorityExpression(s, DIVIDE_SIGN);
        int position = s.length() - 1;
        while (position >= 0){
            if (isDigit(s.charAt(position))){
                position--;
            } else {
                Expression left = evaluate(s.substring(0, position));
                Expression right = new NumberExpression(parseInt(s.substring(position + 1, s.length())));
                char sign = s.charAt(position);
                switch (sign){
                    case '-': return new MinusExpression(left, right);
                    case '+': return new PlusExpression(left, right);
                }
            }
        }
        return new NumberExpression(parseInt(s));
    }

    @NotNull
    private String calculateHigherPriorityExpression(String s, String sign) {
        if (s.contains(sign)){
            int signIndex = s.indexOf(sign);
            int positionRight = signIndex + 1;
            while (positionRight <= s.length() - 1 && isDigit(s.charAt(positionRight))){
                positionRight++;
            }
            int positionLeft = signIndex - 1;
            while (positionLeft >= 0 && isDigit(s.charAt(positionLeft))){
                positionLeft--;
            }

            Expression expressionA = new NumberExpression(parseInt(s.substring(positionLeft + 1, signIndex)));
            Expression expressionB = new NumberExpression(parseInt(s.substring(signIndex + 1, positionRight)));
            int priorityOperationResult = 0;
            switch (sign){
                case MULTIPLY_SIGN:
                    priorityOperationResult = new MultiplyExpression(expressionA,expressionB).interpret();
                    break;
                case DIVIDE_SIGN:
                    priorityOperationResult = new DivideExpression(expressionA, expressionB).interpret();
            }
            s = s.substring(0, positionLeft + 1) + priorityOperationResult + s.substring(positionRight, s.length());
        }
        return s;
    }

    private void bracketsCheck(String s) {
        if ((s.contains(OPENED_BRACKET) && !s.contains(CLOSED_BRACKET))
                || (s.contains(CLOSED_BRACKET) && !s.contains(OPENED_BRACKET)))
            throw new IllegalArgumentException("Unclosed bracket");
    }

    private void prioritySignArgumentCheck(String s, String prioritySign) {
        if (s.startsWith(prioritySign))
            throw new IllegalArgumentException("Expression starts with " + "\'" + prioritySign + "\'.");
        if (s.endsWith(prioritySign))
            throw new IllegalArgumentException("Expression ends with " + "\'" + prioritySign + "\'.");
    }
}
