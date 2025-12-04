/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class camionArena extends carro {
    private int pesoC;
    public camionArena(String marca, String color, int km, int numllantas,int pesoC) {
        super(marca, color, km, numllantas);
        this.pesoC=pesoC;
    }

    public int getPesoC() {
        return pesoC;
    }
    
}
