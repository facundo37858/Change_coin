import Logica.showInputDialog;

public class Main {
    public static void main(String[] args) {
       showInputDialog input = new showInputDialog("Enter amount of money to convert");
       String value = input.getValue();
        System.out.println(value);





    }
}