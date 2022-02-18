package by.it.kuzma.jd01_07;

class Scalar extends Var{

    private final double value;

    public Scalar(String stringValue){
        value=Double.parseDouble(stringValue);
    }

    public Scalar(double value){
        this.value=value;
    }

    public Scalar(Scalar otherScalar){
        this.value=otherScalar.value;
    }

    public double getValue(){
        return this.value;
    }




    @Override
    public String toString() {
        return Double.toString(value);
    }
}
