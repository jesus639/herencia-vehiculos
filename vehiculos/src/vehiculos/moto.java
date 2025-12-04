/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class moto extends camionArena {
    private int anchoV;
    public moto(String marca, String color, int km, int numllantas, int pesoC, int anchoV) {
        super(marca, color, km, numllantas, pesoC);
    this.anchoV=anchoV;
    }

    public int getAnchoV() {
        return anchoV;
    }
    
}
