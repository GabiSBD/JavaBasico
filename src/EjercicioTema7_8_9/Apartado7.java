package EjercicioTema7_8_9;

public class Apartado7
{
    public static void main(String[]args){
       try{
           System.out.println(dividePorCero(4,0));
       }catch (ArithmeticException e){
           System.out.println("Esto no puede hacerse");
       }
        System.out.println("Demo de codigo");
    }
    static int dividePorCero(int a,int b) throws ArithmeticException
    {
        int resultado=0;
        try
        {
            resultado=a/b;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;
    }
}

