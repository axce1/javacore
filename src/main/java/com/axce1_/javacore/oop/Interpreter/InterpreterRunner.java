package com.axce1_.javacore.oop.Interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExp();
        Expression isJavaEE = getJavaEEExp();

        System.out.println(isJava.interpret("java core"));
        System.out.println(isJavaEE.interpret("spring"));
    }

    public static Expression getJavaExp() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java core");
        return new OrExpression(java, javaCore);
    }
    public static Expression getJavaEEExp() {
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("spring");
        return new AndExpression(java, spring);
    }
}
