package org.cleancoding.behavioural.interpreter;

public class InterpreterDemo {

    public static void main(String[] args) {

        Expression expr =
                new AndExpression(
                        new BooleanExpression(true),
                        new BooleanExpression(false)
                );

        System.out.println(expr.interpret());

        Expression orExp = new OrExpression(new BooleanExpression(true), expr);

        System.out.println(orExp.interpret());
    }
}