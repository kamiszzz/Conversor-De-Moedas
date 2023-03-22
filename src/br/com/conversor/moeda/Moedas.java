package br.com.conversor.moeda;
import javax.swing.*;
import java.text.DecimalFormat;

public class Moedas {
    DecimalFormat df = new DecimalFormat();
    ImageIcon icon = new ImageIcon("C:\\Users\\Downloads\\real.png");

    private double realParaDolar = 0.19;
    private double realParaEuro = 0.19;
    private double realParaLibras = 0.16;
    private double realParaPesoArgentino = 25.0;
    private double realParaPesoChileno = 175.0;

    private double dolarParaReal = 5.36;
    private double euroParaReal = 5.45;
    private double librasParaReal = 6.44;
    private double pesoArgentinoParaReal = 0.04;
    private double pesoChilenoParaReal = 0.006;

    public double realParaDolar(double valor) {
        valor = valor * realParaDolar;
        JOptionPane.showMessageDialog(null, "US$ " + df.format(valor), "resultado", 0,
                new ImageIcon("C:\\Users\\Downloads\\dolar.png"));
        return valor;
    }

    public double realParaEuro(double valor) {
        valor = valor * realParaEuro;
        JOptionPane.showMessageDialog(null, "€ " + df.format(valor), "resultado", 0,
                new ImageIcon("C:\\Users\\Downloads\\euro.png"));
        return valor;
    }

    public double realParaLibras(double valor) {
        valor = valor * realParaLibras;
        JOptionPane.showMessageDialog(null, "£ " + df.format(valor), "resultado", 0,
                new ImageIcon("C:\\Users\\Downloads\\libra.png"));
        return valor;
    }

    public double realParaPesoArgentino(double valor) {
        valor = valor * realParaPesoArgentino;
        JOptionPane.showMessageDialog(null, "ARS$ " + df.format(valor), "resultado", 0,
                new ImageIcon("C:\\Users\\Downloads\\peso.png"));
        return valor;
    }

    public double realParaPesoChileno(double valor) {
        valor = valor * realParaPesoChileno;
        JOptionPane.showMessageDialog(null, "CLP$ s" + df.format(valor), "resultado", 0,
                new ImageIcon("C:\\Users\\Downloads\\chileno.png"));
        return valor;
    }

    // Conversões para reais

    public double pesoChilenoParaReal(double valor) {
        valor = valor * pesoChilenoParaReal;
        JOptionPane.showMessageDialog(null, "R$ " + df.format(valor), "resultado", 0, icon);
        return valor;
    }

    public double pesoArgentinoParaReal(double valor) {
        valor = valor * pesoArgentinoParaReal;
        JOptionPane.showMessageDialog(null, "R$ " + df.format(valor), "resultado", 0, icon);
        return valor;
    }

    public double dolarParaReal(double valor) {
        valor = valor * dolarParaReal;
        JOptionPane.showMessageDialog(null, "R$ " + df.format(valor), "resultado", 0, icon);
        return valor;
    }

    public double euroParaReal(double valor) {
        valor = valor * euroParaReal;
        JOptionPane.showMessageDialog(null, "R$ " + df.format(valor), "resultado", 0, icon);
        return valor;
    }

    public double librasParaReal(double valor) {
        valor = valor * librasParaReal;
        JOptionPane.showMessageDialog(null, "R$ " + df.format(valor), "resultado", 0, icon);
        return valor;
    }

}
