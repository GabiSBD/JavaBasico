package EjercicioTema4;

public class Ejercicio4 {
    public static void main(String[]args){
        SmartPhone obj1=new SmartPhone("iphoneX",500,"ios",true,true);
        SmartWatch obj2=new SmartWatch("Smartime",12,"android",true,false);

        System.out.println(obj1.getModelo()+obj1.getSistemaOperativo()+obj1.getPeso()+obj1.getCamara()+obj1.getWifi());
        System.out.println("----------------------------------------------------------");
        System.out.println(obj2.getModelo()+obj2.getSistemaOperativo()+obj2.getPeso()+obj2.getCamara()+obj2.getWifi());
    }
}
