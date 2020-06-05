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
public class SuperHumano {
    protected String nombre;
    protected String poder;
    protected String debilidad;
    private Escuadron escuadron;
    private double fuerza;
    private double agilidadfisica;
    private double agilidadmental;

    public SuperHumano() {
    }

    public SuperHumano(String nombre, String poder, String debilidad, Escuadron escuadron, double fuerza, double agilidadfisica, double agilidadmental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidadfisica = agilidadfisica;
        this.agilidadmental = agilidadmental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Escuadron getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadron escuadron) {
        this.escuadron = escuadron;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getAgilidadfisica() {
        return agilidadfisica;
    }

    public void setAgilidadfisica(double agilidadfisica) {
        this.agilidadfisica = agilidadfisica;
    }

    public double getAgilidadmental() {
        return agilidadmental;
    }

    public void setAgilidadmental(double agilidadmental) {
        this.agilidadmental = agilidadmental;
    }

    @Override
    public String toString() {
        return "SuperHumano{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", escuadron=" + escuadron + ", fuerza=" + fuerza + ", agilidadfisica=" + agilidadfisica + ", agilidadmental=" + agilidadmental + '}';
    }
    
}
