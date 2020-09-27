package main.java.com.sergeykarpen.javacore.patterns.behavioral.interpretator;

import main.java.com.sergeykarpen.javacore.patterns.behavioral.strategy.Working;

public class InterpretRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Does developer know Java Core:" + isJava.interpret("javaCore"));
        System.out.println("Does developer know Java EE:" + isJavaEE.interpret("Java Spring"));

    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new OrExpression(java, spring);
    }
}
