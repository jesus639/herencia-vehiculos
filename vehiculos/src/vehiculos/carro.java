/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class carro extends Vehiculos {
    private int numllantas;
    public carro(String marca, String color, int km, int numllantas) {
        super(marca, color, km);
        this.numllantas=numllantas;
    }

    public int getNumllantas() {
        return numllantas;
    }

        
    }

