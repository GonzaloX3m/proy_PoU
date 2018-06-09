/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gonzalo
 */
public class Alimento {
    private String nombre;
    //private int precio; ¿Incluir?
    private int valorDeRestauracion;

    public Alimento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorDeRestauracion() {
        return valorDeRestauracion;
    }

    public void setValorDeRestauracion(int valorDeRestauracion) {
        this.valorDeRestauracion = valorDeRestauracion;
    }

    @Override
    public String toString() 
    {
        return nombre;
    }
    
    
    
    
}
