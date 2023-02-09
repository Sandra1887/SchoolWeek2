import javax.swing.*;

public class Converter {
    public static void main (String[] arg) {

        String[] buttons1 = {"Celsius", "Fahrenheit", "Kelvin"};
        int knappNr1 = JOptionPane.showOptionDialog(null, "Choose which scale to convert from",
                "Temperature Converter", JOptionPane.PLAIN_MESSAGE, 0, null, buttons1, buttons1[0]);


        String a = JOptionPane.showInputDialog("Type the temperature: ");
        double temp = Double.parseDouble(a);


        String[] buttons2 = {"Celsius", "Fahrenheit", "Kelvin"};
        int knappNr2 = JOptionPane.showOptionDialog(null, "Choose which scale to convert to", "Choose",
                JOptionPane.PLAIN_MESSAGE, 0, null, buttons2, buttons2[0]);


        if (knappNr1 == 0 && knappNr2 == 1) { //c -> f
            JOptionPane.showMessageDialog(null, Scales.cel2Fah(temp));
        } else if (knappNr1 == 0 && knappNr2 == 2) {
            JOptionPane.showMessageDialog(null, Scales.cel2Kel(temp));
        } else if (knappNr1 == 1 && knappNr2 == 0) {
            JOptionPane.showMessageDialog(null, Scales.fah2Cel(temp));
        } else if (knappNr1 == 1 && knappNr2 == 3) {
            JOptionPane.showMessageDialog(null, Scales.fah2Kel(temp));
        } else if (knappNr1 == 2 && knappNr2 == 0) {
            JOptionPane.showMessageDialog(null, Scales.kel2Cel(temp));
        } else if (knappNr1 == 2 && knappNr2 == 1) {
            JOptionPane.showMessageDialog(null, Scales.kel2Fah(temp));
        } else {
            JOptionPane.showMessageDialog(null, "Funny guy!");
        }
        System.exit(0);
    }
}