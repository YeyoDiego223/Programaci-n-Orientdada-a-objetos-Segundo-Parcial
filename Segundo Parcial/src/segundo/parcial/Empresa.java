/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo.parcial;

/**
 *
 * @author flore
 */
public class Empresa {
    
    private String cif;
    
    private Direccion direccion;
    
    public Direccion getDireccion() {
        return direccion;
    }
    
    public void setDirección(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public String getCif() {
        return cif;
    }
    
    public void setCif(String cif) {
        this.cif =cif;
    }

    void setDireccion(Direccion d2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
