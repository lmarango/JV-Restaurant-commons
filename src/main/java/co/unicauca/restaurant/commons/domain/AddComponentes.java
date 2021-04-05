/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.commons.domain;

/**
 *
 * @author juanj
 */
public class AddComponentes {
    private int compId;
    
    private String compNombre;
    
    private int precio;
    
    private String Tipo;
    
    private byte [] CompImage;

    public AddComponentes(int compId, String compNombre, int precio, String Tipo, byte[] CompImage) {
        this.compId = compId;
        this.compNombre = compNombre;
        this.precio = precio;
        this.Tipo = Tipo;
        this.CompImage = CompImage;
    }

    public int getCompId() {
        return compId;
    }

    public void setCompId(int compId) {
        this.compId = compId;
    }

    public String getCompNombre() {
        return compNombre;
    }

    public void setCompNombre(String compNombre) {
        this.compNombre = compNombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public byte[] getCompImage() {
        return CompImage;
    }

    public void setCompImage(byte[] CompImage) {
        this.CompImage = CompImage;
    }
    
    

}