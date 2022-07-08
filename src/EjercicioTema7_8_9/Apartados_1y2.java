package EjercicioTema7_8_9;

public class Apartados_1y2 {
    public static void main(String[]args){

        int[]numeros=new int[10];
        //damos valores al array
        for(int num=1;num<=numeros.length;num++){
            numeros[num-1]=num;
        }
        //luego lo imprimimos mediante un foreach
        System.out.println("valores del array unidimensional");
        for(int n:numeros){
            System.out.print(n+" ");
        }
        System.out.println("\n-----------------------------------------\nvalores del array bidimensional");
        /* mediante un blucle for anidado dentro de otro recorremos las dos dimensiones le damos unos valores e imprimimos dentro del mismo
        podriamos usar la clase Random para dar valores aleatorios pero elegi el algoritmo x+y que para el caso no era necesario mas
         */

        int[][]bidimensional=new int [2][2];
        for(int x=0;x<bidimensional.length;x++){
            for(int y=0;y<bidimensional.length;y++){
                bidimensional[x][y]=x+y;
                System.out.println("posicion ["+x+"]["+y+"]="+bidimensional[x][y]);
            }
        }




    }
}
