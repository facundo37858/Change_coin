package Logica;


import java.util.Objects;

public enum Currencies {
    DOLAR("Dolar",2),
    EURO("Euro",4),
    LIBRAS_ESTERLINAS("Libra esterlina",5),
    YEN_JAPONES("Yen japones",1.5),
    WON_SOUL_COREANO("Won soul-coreano",1.8);
    private final String getCurrencyName;
    private final double convert;

    public double getConvert() {
        return convert;
    }
    Currencies(String currencyName, double value) {
        this.getCurrencyName = currencyName;
        this.convert = value;
    }

     @Override
    public String toString() {
        return getCurrencyName;
    }



}
