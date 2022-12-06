import Logica.Currencies;
import Logica.OptionsConvertion;
import Logica.ShowInputDialog;
import Logica.ShowMultipleSelector;

public class Main {
    public static void main(String[] args) {

        OptionsConvertion[] optionConvertions = OptionsConvertion.values();
        ShowMultipleSelector optionsConvertions = new ShowMultipleSelector(optionConvertions);
        String optionConvertSelected = optionsConvertions.showMultipleSelctorValues("Choose a conversion option");

        ShowInputDialog input = new ShowInputDialog("Enter value");
        int value = Integer.parseInt(input.getValue());

        Currencies[] optionCurrency = Currencies.values();
        ShowMultipleSelector optionsCurrency = new ShowMultipleSelector(optionCurrency);
        String optionCurrencySelected = optionsCurrency.showMultipleSelctorValues("Convert to:");

       double converted = optionsCurrency.convetion(optionCurrencySelected);
        System.out.println(converted);
        System.out.println(value);
        System.out.println(value*converted);

    }
}