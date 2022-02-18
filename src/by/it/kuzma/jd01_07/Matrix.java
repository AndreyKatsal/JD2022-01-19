package by.it.kuzma.jd01_07;

class Matrix extends Var {

    private final double[][] value;

    public Matrix(double[][] value) {
        this.value = value.clone();
    }

    public Matrix(Matrix matrix) {
        this.value = matrix.value.clone();
    }

    public Matrix(String strMatrix) {

        String[] rowMatrix = strMatrix.split("},");
        String[][] readyStrMatrix = new String[rowMatrix.length][];

        for (int i = 0; i < rowMatrix.length; i++) {
            readyStrMatrix[i] = rowMatrix[i].replaceAll("[{}]", "").split(",");
        }

        value = new double[readyStrMatrix.length][readyStrMatrix[0].length];

        for (int i = 0; i < readyStrMatrix.length; i++) {
            for (int j = 0; j < readyStrMatrix[i].length; j++) {
                value[i][j] = Double.parseDouble(readyStrMatrix[i][j].trim());
            }
        }
    }

    public double[][] getValue() {
        return value.clone();
    }

    @Override
    public String toString() {

        StringBuilder out = new StringBuilder();
        out.append('{');

        for (int i = 0; i < value.length; i++) {
            out.append('{');
            String delimiter = "";
            for (int j = 0; j < value[i].length; j++) {
                out.append(delimiter).append(value[i][j]);
                delimiter = ", ";
                if (j == value[i].length - 1 && i < value.length - 1) {
                    out.append('}').append(delimiter);
                }
            }
            if (i == value.length - 1) {
                out.append('}');
            }
        }
        out.append('}');

        return out.toString();

    }
}
