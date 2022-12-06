package Logica;
import javax.swing.JOptionPane;

public class ShowInfo {
    private final double coin;
    private final double factorConvert;
    private double result;

    public ShowInfo(double coin, double factorConvert){
        this.coin = coin;
        this.factorConvert = factorConvert;
    }
    public void operation(){
        this.result = this.coin * this.factorConvert;
    }

    public double getResult() {
        return result;
    }
    public void showValue(double value, String nameCoin){
        JOptionPane.showInternalMessageDialog(null, "Tines $"+ value +" "+nameCoin,
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }


}
