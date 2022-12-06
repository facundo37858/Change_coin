package Logica;

public enum Currencies {
    DOLAR("Dolar"),
    EURO("Euro"),
    LIBRAS_ESTERLINAS("Libra esterlina"),
    YEN_JAPONES("Yen japones"),
    WON_SOUL_COREANO("Won soul-coreano");
    private final String getCurrencyName;

    Currencies(String currencyName) {
        this.getCurrencyName = currencyName;
    }
    @Override
    public String toString() {
        return "Convert  pesos to "+ getCurrencyName;
    }

}
