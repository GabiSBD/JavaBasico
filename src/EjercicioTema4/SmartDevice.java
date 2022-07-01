package EjercicioTema4;

public class SmartDevice {
    public SmartDevice(){
      peso=0;
      sistemaOperativo="";
      wifi=false;
      camara=false;
      modelo="";
    }
    public String getPeso(){return "peso: "+peso+"\n";}
    public String getSistemaOperativo(){return "sistema operativo: "+sistemaOperativo+"\n";}
    public String getWifi(){
        if(wifi)return "modelo equipado con conexion wifi+\n";
        else return "este modelo no incorpora wifi\n";
    }
    public String getCamara(){
        if(camara)return "modelo equipado con camara\n";
        else return "este modelo no incorpora camara\n";
    }
    public String getModelo(){return "modelo: "+modelo+"\n";}
    protected int peso;
    protected String sistemaOperativo;
    protected boolean wifi;
    protected boolean camara;
    protected String modelo;
}
class SmartPhone extends SmartDevice{
    public SmartPhone(){
        super();
    }
    public SmartPhone(String mod,int p,String op,boolean w,boolean c){
      peso=p; sistemaOperativo=op;wifi=w;camara=c;modelo=mod;
    }

}
class SmartWatch extends SmartDevice{
    public SmartWatch(){
        super();
    }
    public SmartWatch(String mod, int p,String op,boolean w,boolean c){
        peso=p; sistemaOperativo=op;wifi=w;camara=c;modelo=mod;
    }
}