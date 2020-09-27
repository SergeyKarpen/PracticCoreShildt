package main.java.com.sergeykarpen.javacore.patterns.behavioral.visitor;

public class CrashVisitor implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Мучает двишатель");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Стучит по крыше");
    }
}
