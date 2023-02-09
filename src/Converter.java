import javax.swing.*;

public class Converter {
    public static void main (String[] arg) {
        String a = JOptionPane.showInputDialog("Write your temperature");
        double temp = Double.parseDouble(a);

        double celsFahr = Scales.celFah(temp);
        String cf = String.format("Celsius to Fahrenheit: %4.2f", celsFahr);
        double celsKel = Scales.celKel(temp);
        String ck = String.format("Celsius to Kelvin: %4.2f", celsKel);
        double fahrCel = Scales.fahCel(temp);
        String fc = String.format("Fahrenheit to Celsius: %4.2f", fahrCel);
        double fahrKel = Scales.fahKel(temp);
        String fk = String.format("Fahrenheit to Kelvin: %4.2f", fahrKel);
        double kelvFah = Scales.kelFah(temp);
        String kf = String.format("Kelvin to Fahrenheit: %4.2f", kelvFah);
        double kelvCel = Scales.kelCel(temp);
        String kc = String.format("Kelvin to Celsius: %4.2f", kelvCel);


        String[] buttons = {"C° to F°", "C° to K", "F° to C°", "F° to K", "K to C°", "K to F°"};
        int knappNr = JOptionPane.showOptionDialog(null, "Choose your converter", "Choose",
                JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
        if (knappNr == 0) { //c -> f
            JOptionPane.showMessageDialog(null, cf);
        } else if (knappNr == 1) { //c -> k
            JOptionPane.showMessageDialog(null, ck);
        } else if (knappNr == 2) { //f -> c
            JOptionPane.showMessageDialog(null, fc);
        } else if (knappNr == 3) { //f -> k
            JOptionPane.showMessageDialog(null, fk);
        } else if (knappNr == 4) { //k -> c
            JOptionPane.showMessageDialog(null, kc);
        } else if (knappNr == 5) { //k -> f
            JOptionPane.showMessageDialog(null, kf);
        } else {
            System.exit(0);
        }
    }
}