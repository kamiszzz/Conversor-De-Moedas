package br.com.conversor.moeda;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class ConversorDeMoeda extends Moedas {
    ImageIcon icon = new ImageIcon("C:\\Users\\Downloads\\input.png");
    public void conversorDeMoeda() {
        double recebe = 0;

        Object[] opcoes = { "Real para Dolar", "Real para Euro", "Real para Libras", "Real para Peso Argentino",
                "Real para Peso Chileno", "Dolar para Real", "Euro para Real", "Libras para Real",
                "Peso Argentino para Real", "Peso Chileno para Real" };

        Object res = JOptionPane.showInputDialog(null, "Escolha uma opção", "Conversor de Moeda",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon("C:\\Users\\Downloads\\moeda.png"), opcoes, "");

        if (res.equals("Real para Dolar")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            realParaDolar(recebe);
        } else if (res.equals("Real para Euro")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            realParaEuro(recebe);
        } else if (res.equals("Real para Libras")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            realParaLibras(recebe);
        } else if (res.equals("Real para Peso Argentino")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            realParaPesoArgentino(recebe);
        } else if (res.equals("Real para Peso Chileno")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            realParaPesoChileno(recebe);
        } else if (res.equals("Dolar para Real")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            dolarParaReal(recebe);
        } else if (res.equals("Euro para Real")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            euroParaReal(recebe);
        } else if (res.equals("Libras para Real")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            librasParaReal(recebe);
        } else if (res.equals("Peso Argentino para Real")) {
            try {
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0,icon, null, ""));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!", "", JOptionPane.PLAIN_MESSAGE);
                recebe = Double.parseDouble( (String) JOptionPane.showInputDialog(null, "Insira o valor desejado: ",
                        "", 0, icon, null, ""));
            }
            pesoArgentinoParaReal(recebe);
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
            pesoChilenoParaReal(recebe);
        }
    }
}

