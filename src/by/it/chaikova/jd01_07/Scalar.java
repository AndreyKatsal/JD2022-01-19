package by.it.chaikova.jd01_07;

 class Scalar extends Var {


    private final double value;

    public Scalar(String stringValue) {

        value = Double.parseDouble(stringValue);
    }

    public Scalar(double value) {
        this.value = value;

    }

    public Scalar(Scalar otherScalar) {
        this.value = otherScalar.value;

    }

    public double getValue() {
        return value;
    }


    public String toString() {
        return Double.toString(value);
    }
}
