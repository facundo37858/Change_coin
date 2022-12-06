package Logica;

public enum OptionsConvertion {
    EXCHANGE_MONY("Exchange Mony");
   //CHANGE_DIGITAL_CURRENCY("Change Digital Currency");
    private final String getCurrencyName;
    OptionsConvertion(String currencyName) {
        this.getCurrencyName = currencyName;
    }
    @Override
    public String toString() {
        return getCurrencyName;
    }
}
