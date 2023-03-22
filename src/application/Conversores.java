package application;
import br.com.conversor.moeda.ConversorDeMoeda;
import br.com.conversor.quilometragem.ConversorDeQuilometragem;
import br.com.conversor.temperatura.ConversorDeTemperatura;
import javax.swing.*;

public class Conversores {
    public void conversores(){
        while (true) {
            try {
                Object[] opcoesMenu = { "Conversor de Moedas", "Conversor de Temperatura", "Conversor de Quilômetragem" };
                Object resMenu = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                        JOptionPane.PLAIN_MESSAGE, new ImageIcon("C:\\Users\\Downloads\\sincronizacao.png"), opcoesMenu, "");
                if (resMenu.equals("Conversor de Moedas")) {
                    ConversorDeMoeda converterMoeda = new ConversorDeMoeda();
                    converterMoeda.conversorDeMoeda();
                } else if (resMenu.equals("Conversor de Temperatura")) {
                    ConversorDeTemperatura converterTemperatura = new ConversorDeTemperatura();
                    converterTemperatura.conversorDeTemperatura();
                } else {
                    ConversorDeQuilometragem converterQuilometragem = new ConversorDeQuilometragem();
                    converterQuilometragem.conversorDeQuilometragem();
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Programa Encerrado!", "", JOptionPane.ERROR_MESSAGE);
                break;
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja utilizar o conversor novamente?", "", 0);
            if (resposta == JOptionPane.YES_OPTION) {
                continue;
            } else if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado", "", JOptionPane.PLAIN_MESSAGE,
                        new ImageIcon("C:\\Users\\Downloads\\concluido.png"));
                break;
            } else  {
                JOptionPane.showMessageDialog(null, "Programa Concluído", "", JOptionPane.PLAIN_MESSAGE,
                        new ImageIcon("C:\\Users\\Downloads\\concluido.png") );
                break;
            }

        }
    }
}
