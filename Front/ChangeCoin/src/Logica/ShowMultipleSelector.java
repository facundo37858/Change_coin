package Logica;
import javax.swing.*;
import java.util.Objects;

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
        if (selectedValue != null){
            return selectedValue.toString();
        }
        return null;

    }

    public double convetion(String name){
        Currencies[] values = Currencies.values();
        for (Currencies value : values){
            if(Objects.equals(value.toString(), name)){
                return  value.getConvert();
            }
        }

        return 0;
    }
}
