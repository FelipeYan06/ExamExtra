
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Felipe Yan
 */
public class Planeta {
    private String UA;
    private String iD;
    private String milesk;
    private String nombre;
    
    public static ArrayList<Planeta> planetas = new ArrayList<>();

    public Planeta(String UA, String iD, String milesk, String nombre) {
        this.UA = UA;
        this.iD = iD;
        this.milesk = milesk;
        this.nombre = nombre;
    }

    
    public String getUA() {
        return UA;
    }

    public void setUA(String UA) {
        this.UA = UA;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getMilesk() {
        return milesk;
    }

    public void setMilesk(String milesk) {
        this.milesk = milesk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void mostrarPlanetas(){
        planetas.add(new Planeta("2.77","9","415.5","Ceres"));
        planetas.add(new Planeta("67.67","13","10150.5","Eris"));
        planetas.add(new Planeta("43.13","11","5922","Haumea"));
        planetas.add(new Planeta("5.2","5","780","Jupiter"));
        planetas.add(new Planeta("1.52","4","228","Marte"));
    }
    
    public static void añadirPlanetas(String UA, String iD, String milesk, String nombre){
        planetas.add(new Planeta(UA,iD,milesk,nombre));
    }
    
    public static void eliminarPlanetas(int id){
        planetas.remove(id);
    }

    public static void actualizarPlaneta(int recNo,String id,String nombre, String UA, String milesk){
        
        planetas.get(recNo).setiD(id);       
        planetas.get(recNo).setNombre(nombre);
        planetas.get(recNo).setUA(UA);
        planetas.get(recNo).setMilesk(milesk);
    }
    
    @Override
    public String toString() {
        return "Planeta{ " + "UA= " + UA + ", iD= " + iD + ", milesk= " + milesk + ", nombre= " + nombre + '}';
    }
    
    

}
