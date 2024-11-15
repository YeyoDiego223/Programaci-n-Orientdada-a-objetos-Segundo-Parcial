/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundo.parcial;


/**
 *
 * @author flore
 */
public class SegundoParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion d1= new Direccion("calle A",3);
        Direccion d2= new Direccion("calle B",7);

        Persona p= new Persona ("pepe",20);
        p.setDireccion(d1);
        Empresa e= new Empresa();
        e.setCif("1A");
        e.setDireccion(d2);
            
        System.out.println(p.getDireccion().getCalle());
        System.out.println(e.getDireccion().getCalle());
    }
    
    
    
}
