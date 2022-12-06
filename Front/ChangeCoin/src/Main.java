import Logica.*;

public class Main {
    public static void main(String[] args) {

        OptionsConvertion[] optionConvertions = OptionsConvertion.values();
        ShowMultipleSelector optionsConvertions = new ShowMultipleSelector(optionConvertions);
        String optionConvertSelected = optionsConvertions.showMultipleSelctorValues("Choose a conversion option");

        ShowInputDialog input = new ShowInputDialog("Enter value");


        Currencies[] optionCurrency = Currencies.values();
        ShowMultipleSelector optionsCurrency = new ShowMultipleSelector(optionCurrency);
        String optionCurrencySelected = optionsCurrency.showMultipleSelctorValues("Convert to:");

        double value = Integer.parseInt(input.getValue());
        double converted = optionsCurrency.convetion(optionCurrencySelected);

        ShowInfo info = new ShowInfo(value,converted);
        info.operation();
        double result = info.getResult();
        info.showValue(result,optionCurrencySelected);

    }
}