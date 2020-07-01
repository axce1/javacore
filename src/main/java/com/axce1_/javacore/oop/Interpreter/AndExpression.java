package com.axce1_.javacore.oop.Interpreter;

public class AndExpression implements Expression {
    public Expression expression1;
    public Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
