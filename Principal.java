
package controlador;

import vistas.Frame;

/**
 *
 * @author Felipe Yan
 */
public class Principal {
    
    static Frame frame = new Frame();

    
    public static void author64762(){
        System.out.println("Nombre: Felipe Yan Santos");
        System.out.println("Matricula: 64762");
        System.out.println("Correo: al64762@uacam.com");
        System.out.println("Hobbie: Jugar Videojuegos, ver peliculas");
    } 
    
    
    public static void main(String[] args) {
        author64762();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }
    
}
