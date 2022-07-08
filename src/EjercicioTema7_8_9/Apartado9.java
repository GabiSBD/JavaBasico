package EjercicioTema7_8_9;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;
/** Este programa va a pedir informacion a traves de ventanas emergentes con el objetivo de crear listados en .txt,
 * y almacenarlos en un hahsmap siendo la clave o indice, el numero de la lista otorgado por orden de creacion(1,2,3,etc...)
 * al final preguntara si se desea ver por consola algunos de los ficheros creados.
 * el programa contiene arrays(byte[]),hashmap,control de excepciones,y el uso de las clases InputStream y PrintStream
 * */

public class Apartado9 {
    public static void main(String[]args){

            HashMap<Integer,byte[]> indice=new HashMap<>();

        //en este do/While crearemos las instancias necesarias de la clase Lista, obtendremos
        // su array de bytes y lo meteremos en un registro del hashmap
        int numListas = Integer.parseInt(JOptionPane.showInputDialog("¿cuantas listas deseas crear?"));
        boolean ok;
            try{
                do {
                    ok=true;

                    for (int i = 1; i <= numListas; i++) {
                    String titulo = JOptionPane.showInputDialog("nombra la lista " + i);
                    JOptionPane.showMessageDialog(null, "iniciando lista " + i);
                    indice.put(i, new Lista(titulo).getBuffer());
                    }
                    if(numListas<1){
                    JOptionPane.showMessageDialog(null, "cuidado recuerda que debes crear almenos una lista" +
                            " y debes indicarlo en cifras numericas, vuelve a intentarlo, gracias");

                    numListas=Integer.parseInt(JOptionPane.showInputDialog("¿cuantas listas deseas crear?"));

                    ok=false;
                    }
                }while (!ok);
            }catch (NumberFormatException e){
                System.out.println( e.getMessage());
            }

        //Este otro boque se encarga de saber si se desea imprimir por consola uno o varios de los listados creados

        if(numListas>0){
            String visualiza;
            do {
                 visualiza = JOptionPane.showInputDialog("¿deseas visualizar alguna lista ahora mismo?\nSI/NO");

                if (visualiza.equalsIgnoreCase("si")) {
                    try {
                     int seleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que lista deseas visualizar por consola?\n1 / 2 / 3..."));

                     System.out.println("viualizando lista: "+ seleccion);

                    LectorListas.leer(indice.get(seleccion));

                    }catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null,"no se encuentra la lista indicada");
                        System.out.println(e.getMessage());
                    }catch (NumberFormatException e){
                         System.out.println(e.getMessage());
                    }

                }

            }while (visualiza.equalsIgnoreCase("si"));
        }

    }
}

     class Lista {

    //el siguiente constructor genera un fichero.txt y lo almacena porteriormente toda su informacion en un array de bytes
        public Lista(String n){
        nombreLista=n;

            try {
               PrintStream  lista = new PrintStream(nombreLista + ".txt");

                do {
                    lista.println(JOptionPane.showInputDialog("introduce un nuevo registro" ));

                    repeat = JOptionPane.showInputDialog("quieres añadir mas registros? si/no");

                    if(repeat.equalsIgnoreCase("no")) lista.close();

                } while (repeat.equalsIgnoreCase("si"));

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

            //ahora convertimos a un array de bytes la lista generada con el constructor de clase
            try {
                InputStream toBuffer = new FileInputStream(nombreLista + ".txt");
                 buffer = toBuffer.readAllBytes();
                 toBuffer.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "LISTA FINALIZADA");
        }
        //con getBuffer obtendremos la lista guardada en un array d bytes al instanciar el obj lista para usarlo en el hashmap
        public byte[] getBuffer(){return buffer;}
        private byte[]buffer;
        private final String nombreLista;
        private String repeat;

    }

    //esta clase se encarga de leer el byte[] de cada lista y escribirlo por consola
   class LectorListas{

    public static void leer(byte[] buffer){


        for(byte caracter:buffer){
            if((char)caracter=='\n') System.out.println();
           else System.out.print((char)caracter);

        }
        System.out.println("-------------------------------------");
    }
  }