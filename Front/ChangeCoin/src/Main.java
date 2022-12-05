import Logica.ShowInputDialog;
import Logica.ShowMultipleSelector;

public class Main {
    public static void main(String[] args) {
        ShowMultipleSelector options = new ShowMultipleSelector();
        String option = options.showMultipleSelctorValues();
        System.out.println(option);
        ShowInputDialog input = new ShowInputDialog("Enter amount of money to convert");
        String value = input.getValue();
        System.out.println(value);





    }
}