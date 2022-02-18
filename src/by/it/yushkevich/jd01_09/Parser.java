package by.it.yushkevich.jd01_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public Var calc(String expression) {
//2 + 2
        expression.replaceAll(Patterns.SPACES, "");
        String[] parts = expression.split(Patterns.OPERATION, 2);// разделили не более чем на две части (т.е. нашли левую и правую часть)
        if (parts.length == 1) {
            return Var.create(expression);
        }

        Var left = Var.create(parts[0]);
        Var right = Var.create(parts[1]);

        if (left == null || right == null) {
            System.out.println("ERROR EXPRESSION " + expression);
            return null;
        }

        Matcher matcher = Pattern.compile(Patterns.OPERATION).matcher(expression);
        if (matcher.find()) {

            String operation = matcher.group();

            switch (operation) {
                case "+":
                    return left.add(right);
                case "-":
                    return left.sub(right);
                case "*":
                    return left.mul(right);
                case "/":
                    return left.div(right);
            }

        }


        return null;

    }
}
