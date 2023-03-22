package br.com.conversor.temperatura;
import javax.swing.*;

public class ConversorDeTemperatura extends Temperatura {
    ImageIcon icon = new ImageIcon("C:\\Users\\Downloads\\input.png");

    public void conversorDeTemperatura() {
        double recebe = 0;

        Object[] opcoes = { "Celsius para Kelvin", "Celsius para Fahrenheit", "Kelvin para Celsius",
                "Kelvin para Fahrenheit", "Fahrenheit para Celsius", "Fahrenheit para Kelvin" };
        Object res = JOptionPane.showInputDialog(null, "Escolha uma opção", "Conversor de Temperatura",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon("C:\\Users\\128ka\\Downloads\\temperatura.png"), opcoes, "");

        if (res.equals("Celsius para Kelvin")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            celsiusParaKelvin(recebe);
        } else if (res.equals("Fahrenheit para Kelvin")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            fahrenheitParaKelvin(recebe);
        } else if (res.equals("Celsius para Fahrenheit")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            celsiusParaFahrenheit(recebe);
        } else if (res.equals("Kelvin para Fahrenheit")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            kelvinParaFahrenheit(recebe);
        } else if (res.equals("Fahrenheit para Celsius")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            fahrenheitParaCelsius(recebe);
        } else {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            kelvinParaCelsius(recebe);
        }
    }
}

