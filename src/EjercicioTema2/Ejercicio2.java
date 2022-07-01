package EjercicioTema2;

public class Ejercicio2 {
    public static void main(String[]args){
       double articulo=45;
        precioTotal(articulo);
    }
    static void precioTotal(double base){
        double iva=base*0.21;
        base=base+iva;
        System.out.println(base);
    }
}
