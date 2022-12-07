import Logica.*;

public class Main {

    public void inicio(){
        //Comienzo programa
        //Selecion del tipo de convercion
        OptionsConvertion[] optionConvertions = OptionsConvertion.values();
        ShowMultipleSelector optionsConvertions = new ShowMultipleSelector(optionConvertions);
        String optionConvertSelected = optionsConvertions.showMultipleSelctorValues("Choose a conversion option");

        if(optionConvertSelected == null){
            ShowDialogMessage finish = new ShowDialogMessage();
            finish.showDialogFinish();
            System.exit(200);
        }
        //Seleccionar tipo de cambio
        Currencies[] optionCurrency = Currencies.values();
        ShowMultipleSelector optionsCurrency = new ShowMultipleSelector(optionCurrency);
        String optionCurrencySelected = optionsCurrency.showMultipleSelctorValues("Convert to:");

        if( optionCurrencySelected == null){
            ShowDialogMessage dialoog = new ShowDialogMessage();
            int response = dialoog.showDialog("¿Desea continuar?");
            if(response == 0){
                inicio();
            }else {
                ShowDialogMessage finishDialog = new ShowDialogMessage();
                finishDialog.showDialogFinish();
                System.exit(200);
            }
        }
        //Enter dato
        ShowInputDialog input = new ShowInputDialog("Enter value");
        String responseInputDialog = input.getValue();
        if(responseInputDialog == null){
            ShowDialogMessage dialoog = new ShowDialogMessage();
            int respose = dialoog.showDialog("¿Desea continuar?");
            if(respose == 0){
                inicio();
            }else {
                ShowDialogMessage finishDialog = new ShowDialogMessage();
                finishDialog.showDialogFinish();
                System.exit(200);
            }
        }
        double value = Integer.parseInt(responseInputDialog);
        double converted = optionsCurrency.convetion(optionCurrencySelected);

        ShowInfo info = new ShowInfo(value,converted);
        info.operation();
        double result = info.getResult();
        info.showValue(result,optionCurrencySelected);

        ShowDialogMessage dialoog = new ShowDialogMessage();
        int respose = dialoog.showDialog("¿Desea continuar?");
        System.out.println(respose);
        if(respose == 0){
            inicio();
        }else {
            ShowDialogMessage finishDialog = new ShowDialogMessage();
            finishDialog.showDialogFinish();
            System.exit(200);
        }
    }

    public static void main(String[] args) {
       Main inicio = new Main();
       inicio.inicio();
    }
}