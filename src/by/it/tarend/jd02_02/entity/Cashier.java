package by.it.tarend.jd02_02.entity;

public class Cashier {

    public final String name;
    public Double cashRegister = 0.0;

    public Cashier(int number) {
        this.name = "Cashier № " + number;
    }

    @Override
    public String toString() {
        return name;
    }
}
