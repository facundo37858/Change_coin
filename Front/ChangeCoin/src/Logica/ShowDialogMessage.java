package Logica;

import javax.swing.*;

public class ShowDialogMessage {
    public int showDialog(String massage){
        return JOptionPane.showInternalConfirmDialog(null,
                 massage, "Select an option",
                 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
    public void showDialogFinish(){
        JOptionPane.showMessageDialog(null,
                "Programa finalizado",
                "Massage",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}
