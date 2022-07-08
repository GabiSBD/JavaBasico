package EjercicioTema7_8_9;

import java.util.Vector;

public class Apartados_3y4 {
    public static void main(String[]args){
        Vector<Integer> vectorInt=new Vector<>();
        vectorInt.add(202);
        vectorInt.add(55);
        vectorInt.add(9);
        vectorInt.add(12);
        vectorInt.add(70);

        vectorInt.remove(2);
        vectorInt.remove(2);//al iniciar esta orden ya ha sustraido el anterior rgistro
                                    // y la cuenta se hace sincontra con el

        for(int num:vectorInt){
            System.out.println(num);
        }

        /*Indica cuál es el problema de utilizar un Vector con la capacidad por
        defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        Respuesta:cada vez que este rebasara su capacidad inicial (por defecto 10)
        este tendria que crear un nuevo array y copiar todos los elementos a este nuevo array
        lo cual seria una tarea que costaria mucho gasto de recursos de la aplicacion sobretodo
         en volumenes extensosde datos como en este caso panteado donde llevaria a cabo
         esta tarea multiples veces*/
    }
}
