package EjercicioTema7_8_9;

import java.io.*;

public class Apartado8 {
    public static void main(String[]args){
        copiaFicheros("C:\\Users\\Usuario\\Desktop\\programacion\\bootcamp\\JavaBasico\\original.txt",
                "C:\\Users\\Usuario\\Desktop\\programacion\\bootcamp\\JavaBasico\\copia.txt");

    }
    static void copiaFicheros(String fileIn,String fileOut){
        try{
            InputStream original=new FileInputStream(fileIn);
            byte[]datos=original.readAllBytes();

            PrintStream copia= new PrintStream(fileOut);
            copia.write(datos);
            original.close();
            copia.close();

        }catch (FileNotFoundException e){
            System.out.println("el fichero no existe"+e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
