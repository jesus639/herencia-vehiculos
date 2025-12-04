/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class Vehiculos {
private String marca;
private String color;
private int km;

    public Vehiculos(String marca, String color, int km) {
        this.marca = marca;
        this.color = color;
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }


    
}
