package EjercicioTema7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class Apartado5 {
    public static void main(String[]args){
        ArrayList<String>listado=new ArrayList<>();
        listado.add("juan");
        listado.add("maria");
        listado.add("roberto");
        listado.add("cristina");

        LinkedList<String>copia=new LinkedList<>(listado);
        /*LinkedList<String>copia=new LinkedList<>();
          copia.addAll(listado);*/

         System.out.println("ArrayList:\n"+listado);
        System.out.println("-------------------------------------");
         System.out.println("LinkedList:\n"+copia);

    }
}
