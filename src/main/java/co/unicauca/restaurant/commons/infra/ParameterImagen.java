/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.commons.infra;

/**
 *
 * @author HP
 */
public class ParameterImagen {
    private String name;
    private byte[] value;

    public ParameterImagen(String name, byte[] value) {
        this.name = name;
        this.value = value;
    }

    
    public ParameterImagen() {
    }

    public String getName() {
        return name;
    }

    public byte[] getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(byte[] value) {
        this.value = value;
    }
    
}
