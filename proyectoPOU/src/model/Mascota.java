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
public class Mascota {
    
    private final int SALUD_MAX= 100;
    private final int SALUD_MIN= 100;
    private final int ENERGIA_MAX= 100;
    private final int ENERGIA_MIIN= 1;
    private final int HAMBRE_MAX= 100;
    private final int HAMBRE_MIN= 1;
    private final int DIVERSION_MAX= 100;
    private final int DIVERSION_MIN= 1;
    private float energia;
    private float hambre;
    private float diversion;
    private float salud;
    
    /*  USO VALRES FLOTANTES PARA PODER DISMINUIR DE FORMA MAS GRADUAL CADA VALOR DEL SISTEMA.
        
        ASI, PODEMOS TRABAJAR CON UN SOLO HILO, DISMINUYENDO CADA VALOR A UNA VELOCIDAD PREDEFINIDA.
    EJEMPLO:
        DISMINUIR UN VALOR A RAZÓN DE 0.8 X SEGUNDO, Y OTRO A RAZÓN DE 0.3 X SEGUNDO.
    
    SE PODRIA EMPLEAR UNA CLASE LLAMADA <<ITEM>> PARA CREAR TODAS LAS INSTANCIAS QUE INTERVENGAN EN EL SISTEMA,
    CUMPLIENDO FUNCIONES DISTINTAS PERO EMPLEANDO LOS MISMOS ATRIBUTOS;
    -ALIMENTO
    -JUGUETE
    -JABONES (XD)
    -ETC.
    */
    
}
