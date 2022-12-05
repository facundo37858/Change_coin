package Logica;
import javax.swing.JOptionPane;

public class ShowMultipleSelector {

private final OptionsConvertion optionOne = OptionsConvertion.Change_Digital_Currency;
private final OptionsConvertion optionTwo = OptionsConvertion.Exchange_money;

    public String showMultipleSelctorValues(){
        Object[] possibleValues = {
                optionOne.toString().replace("_"," "),
                optionTwo.toString().replace("_"," ")
        };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Choose a conversion option",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                possibleValues, "Select one choose"
        );
        return selectedValue.toString();
    }


}
