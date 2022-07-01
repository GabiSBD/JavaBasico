package EjercicioTema3;

public class Ejercicio3 {
    public static void main(String[]args){
        //mi forma favorita
        String[]matrix={"hola ","hemos ","concatenado ","texto "};
        for(String palabra:matrix) System.out.print(palabra);

        //segunda forma
        System.out.println();
        String frase="";

        for(int i=0;i< matrix.length;i++){

            frase+=matrix[i];

        }
        System.out.println(frase);
    }
}
