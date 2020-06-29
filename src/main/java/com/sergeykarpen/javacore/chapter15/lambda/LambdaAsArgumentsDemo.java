package main.java.com.sergeykarpen.javacore.chapter15.lambda;

interface StringFunc {
    String func(String n);
}

public class LambdaAsArgumentsDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре: " + outStr);

        //Удалим пробелы
        outStr = stringOp((str) -> {
            StringBuilder result = new StringBuilder();
            int i;

            for (i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result.append(str.charAt(i));

            return result.toString();
        }, inStr);
        System.out.println("Это строка с удаленными пробелами: " + outStr);

        StringFunc reverse = (str) -> {
            StringBuilder result = new StringBuilder();
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result.append(str.charAt(i));

            return result.toString();
        };

        System.out.println("Это обращенная стирока: " + stringOp(reverse, inStr));

    }
}
