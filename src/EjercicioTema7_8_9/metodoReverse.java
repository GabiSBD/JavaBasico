package EjercicioTema7_8_9;

import javax.swing.*;

import java.awt.event.KeyAdapter;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class metodoReverse {
    public static void main(String[]args){
        String entrada= JOptionPane.showInputDialog("Escriba un texto, gracias");
        System.out.println("su texto va a procedes a invertirse");
        System.out.println(reverse(entrada));
    }
    static String reverse(String texto){
      String input=texto;
      if(input.length()==1) return input;
      else return input.substring(input.length()-1)+reverse(input.substring(0,input.length()-1));

      }
    }

