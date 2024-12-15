/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso;
        double alt;
        double result;
        
        
        peso = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso em kilogramas"));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura em metros"));
        
        result = (peso / (alt * alt));
        
        JOptionPane.showMessageDialog(null,"Seu IMC é: " + Double.toString(result));
    }
    
}
