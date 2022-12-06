package Logica;
import javax.swing.*;
public class ShowMultipleSelector {
    private   Object[] options;

    public ShowMultipleSelector(Currencies[] optionsValues) {
        Object[] aux = new Object[optionsValues.length];
        for( int i = 0 ; i < optionsValues.length;i++){
            aux[i] = optionsValues[i];
        }
        this.options = aux;
    }

    public ShowMultipleSelector(OptionsConvertion[] optionsValues) {
        Object[] aux = new Object[optionsValues.length];
        for( int i = 0 ; i < optionsValues.length;i++){
            aux[i] = optionsValues[i];

        }
        this.options = aux;
        //this.options = options;
    }

    public Object[] getOptions() {
        return options;
    }

    public String showMultipleSelctorValues(String message){
        Object selectedValue = JOptionPane.showInputDialog(null,
                message,
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                this.options, "Select one choose"
        );
        return selectedValue.toString();
    }
}
