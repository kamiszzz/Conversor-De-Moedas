package br.com.conversor.quilometragem;
import javax.swing.*;

public class ConversorDeQuilometragem extends Quilometragem {
    ImageIcon icon = new ImageIcon("C:\\Users\\Downloads\\input.png");
    public void conversorDeQuilometragem() {
        double recebe = 0;

        Object[] opcoes = { "Quilômetros para Metros", "Quilômetros para Centímetros", "Metros para Quilômetros",
                "Metros para Centímetros", "Centímetros para Quilômetros", "Centímetros para Metros" };
        Object res = JOptionPane.showInputDialog(null, "Escolha uma opção", "Conversor de Quilometragem",
                JOptionPane.PLAIN_MESSAGE,  new ImageIcon("C:\\Users\\Downloads\\quilometragem.png"), opcoes, "");

        if (res.equals("Quilômetros para Metros")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            kmParaMetros(recebe);
        } else if (res.equals("Quilômetros para Centímetros")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            kmParaCm(recebe);
        } else if (res.equals("Metros para Quilômetros")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
           metrosParaKm(recebe);
        } else if (res.equals("Metros para Centímetros")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            metrosParaCm(recebe);
        } else if (res.equals("Centímetros para Quilômetros")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
           cmParaKm(recebe);
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
            cmParaMetros(recebe);
        }
    }
}
