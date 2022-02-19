package by.it.tarend.calc;

abstract class Var implements Operation {

    public static Var create(String varValue) {
        if (varValue.matches(Patterns.SCALAR)) {
            return new Scalar(varValue);
        } else if (varValue.matches(Patterns.VECTOR)) {
            return new Vector(varValue);
        } else if (varValue.matches(Patterns.MATRIX)) {
            return new Matrix(varValue);
        } else
            return null; // TODO exception
    }

    @Override
    public Var add(Var other) {
        System.out.printf("Operation addition %s + %s impossible%n", this, other);
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Operation subtraction %s - %s impossible%n", this, other);
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Operation multiply %s * %s impossible%n", this, other);
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Operation division %s / %s impossible%n", this, other);
        return null;
    }

    @Override
    public String toString() {
        return "unknown variable";
    }


}
