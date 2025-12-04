/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class Carroelectrico extends tren {
    private String bateria;
    public Carroelectrico(String marca, String color, int km, int numllantas, int pesoC, int anchoV, String cadena, String gasolina, String bateria) {        
        super(marca, color, km, numllantas, pesoC, anchoV, cadena, gasolina);
        this.bateria=bateria;
    }

public void mostrardatos(){
    System.out.println("MARCA: "+getMarca());
    System.out.println("COLOR: "+getColor());
    System.out.println("KILOMETROS: "+getKm());
    System.out.println("NUMERO LLANTAS: "+getNumllantas());
    System.out.println("PESO VEHICULO: "+getPesoC());
    System.out.println("ANCHO VEHICULO: "+getAnchoV());
    System.out.println("TIENE CADENA? "+getCadena());
    System.out.println("USA GASOLINA? "+getGasolina());
    System.out.println("USA BATERIA? "+bateria);
}
    
}
