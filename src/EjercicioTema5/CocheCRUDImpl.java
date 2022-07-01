package EjercicioTema5;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("metodo save");
    }

    @Override
    public void findAll() {
        System.out.println("metodo findAll");
    }

    @Override
    public void Delete() {
        System.out.println("metodo Delete");
    }
}
