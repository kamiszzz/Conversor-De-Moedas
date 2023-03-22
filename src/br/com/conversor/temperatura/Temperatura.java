package br.com.conversor.temperatura;
import javax.swing.*;
import java.text.DecimalFormat;

public class Temperatura {
    DecimalFormat df = new DecimalFormat();
    ImageIcon icon = new ImageIcon("C:\\Users\\Downloads\\temperatura.png");
    public double celsiusParaKelvin(double valor) {
        valor = valor + 273.15;
        JOptionPane.showMessageDialog(null, df.format(valor) + " °K", "resultado", 0, icon);
        return valor;
    }

    public double fahrenheitParaKelvin(double valor) {
        valor = (valor - 32.0) * 5 / 9 + 273.15;
        JOptionPane.showMessageDialog(null, df.format(valor) + " °K", "resultado", 0, icon);
        return valor;
    }

    public double celsiusParaFahrenheit(double valor) {
        valor = (valor * 9 / 5) + 32.0;
        JOptionPane.showMessageDialog(null, df.format(valor) + " °F", "resultado", 0, icon);
        return valor;
    }

    public double kelvinParaFahrenheit(double valor) {
        valor = (valor - 273.15) * 9 / 5 + 32.0;
        JOptionPane.showMessageDialog(null, df.format(valor) + " °F", "resultado", 0, icon);
        return valor;
    }

    public double fahrenheitParaCelsius(double valor) {
        valor = (valor - 32.0) * 5 / 9;
        JOptionPane.showMessageDialog(null, df.format(valor) + " °C", "resultado", 0, icon);
        return valor;
    }

    public double kelvinParaCelsius(double valor) {
        valor = valor - 273.15;
        JOptionPane.showMessageDialog(null, df.format(valor) + " °C", "resultado", 0, icon);
        return valor;
    }

    }


