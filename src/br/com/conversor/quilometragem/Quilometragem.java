package br.com.conversor.quilometragem;

import javax.swing.*;
import java.text.DecimalFormat;

public class Quilometragem {
    DecimalFormat df = new DecimalFormat();
    ImageIcon icon = new ImageIcon("C:\\Users\\Downloads\\quilometragem.png");

    public double metrosParaKm(double valor) {
        valor = valor / 1000;
        JOptionPane.showMessageDialog(null, df.format(valor) + " km", "resultado", 0, icon);
        return valor;
    }
    public double metrosParaCm(double valor) {
        valor = valor * 100;
        JOptionPane.showMessageDialog(null, df.format(valor)+ " cm", "resultado", 0, icon);
        return valor;
    }
    public double kmParaMetros(double valor) {
        valor = valor * 1000;
        JOptionPane.showMessageDialog(null, df.format(valor) + " m", "resultado", 0, icon);
        return valor;
    }
    public double kmParaCm(double valor) {
        valor = valor * 100000;
        JOptionPane.showMessageDialog(null, df.format(valor) + " cm", "resultado", 0, icon);
        return valor;
    }
    public double cmParaMetros(double valor) {
        valor = valor / 100;
        JOptionPane.showMessageDialog(null, df.format(valor) + " m", "resultado", 0, icon);
        return valor;
    }
    public double cmParaKm(double valor) {
        valor = valor / 100000;
        JOptionPane.showMessageDialog(null, df.format(valor) + " km", "resultado", 0, icon);
        return valor;
    }




}
