/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class tren extends cicla {
    private String gasolina;
    public tren(String marca, String color, int km, int numllantas, int pesoC, int anchoV, String cadena,String gasolina) {
        super(marca, color, km, numllantas, pesoC, anchoV, cadena);
        this.gasolina=gasolina;
    }

    public String getGasolina() {
        return gasolina;
    }
    
}
