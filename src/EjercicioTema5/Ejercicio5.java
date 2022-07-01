package EjercicioTema5;

public class Ejercicio5 {
    public static void main(String[]args){
        CocheCRUDImpl coche=new CocheCRUDImpl();
        coche.save();
        coche.findAll();
        coche.Delete();
    }
}
