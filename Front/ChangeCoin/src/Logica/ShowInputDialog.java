package Logica;

import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShowInputDialog {
    private final String mensaje;

    public ShowInputDialog(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getValue() throws NullPointerException {

        try {
            String value = JOptionPane.showInputDialog(this.mensaje);
            Pattern pat = Pattern.compile("^\\d+$");
            Matcher mat = pat.matcher(value);
            if (mat.matches()) {
                return value;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Use only integers",
                        "alert",
                        JOptionPane.ERROR_MESSAGE
                );
                return this.getValue();
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }
}
