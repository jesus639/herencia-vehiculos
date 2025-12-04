/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class cicla extends moto {
    private String cadena;
    public cicla(String marca, String color, int km, int numllantas, int pesoC, int anchoV,String cadena) {
        super(marca, color, km, numllantas, pesoC, anchoV);
        this.cadena=cadena;
    }

    public String getCadena() {
        return cadena;
    }
    
}
