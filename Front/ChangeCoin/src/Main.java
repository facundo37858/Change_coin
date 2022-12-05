import Logica.showInputDialog;
import Logica.showMultipleSelector;

public class Main {
    public static void main(String[] args) {
        showMultipleSelector options = new showMultipleSelector();
        String option = options.showMultipleSelctorValues();
        System.out.println(option);
        showInputDialog input = new showInputDialog("Enter amount of money to convert");
        String value = input.getValue();
        System.out.println(value);





    }
}