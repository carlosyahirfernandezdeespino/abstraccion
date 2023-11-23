//programa de ejemplo de abstraccion
/*Nombre:Carlos Yahir Fernandez De Espino
Grupo:301
Fecha:22/11/2023
*/
package abstraccioon;
import java.util.*;

abstract class Auto {
    String marca;
    String modelo;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String obtenerInformacion() {
        return "Marca: " + marca + "\nModelo: " + modelo;
    }
}

public class Abstraccioon {
    public static void main(String[] args) {
        Auto miAuto = new Auto("TOYOTA", "COROLLA") {};
        System.out.println(miAuto.obtenerInformacion());
    }
}

