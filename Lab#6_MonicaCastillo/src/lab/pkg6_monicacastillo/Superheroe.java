/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_monicacastillo;

/**
 *
 * @author Monica
 */
public class Superheroe extends SuperHumano {

    public Superheroe() {
        super();
    }

    public Superheroe(String nombre, String poder, String debilidad, Escuadron escuadron, double fuerza, double agilidadfisica, double agilidadmental) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental);
    }

    @Override
    public String toString() {
        return nombre + " " + poder;
    }

}
