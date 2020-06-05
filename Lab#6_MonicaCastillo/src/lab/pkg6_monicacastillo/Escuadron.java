/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_monicacastillo;

import java.util.ArrayList;

/**
 *
 * @author Monica
 */
public class Escuadron {

    private String nombre;
    private String lugarbase;
    private String tipo;
    private SuperHumano lider;
    private ArrayList<SuperHumano> superhumano = new ArrayList();

    public Escuadron() {
    }

    public Escuadron(String nombre, String lugarbase, String tipo, SuperHumano lider) {
        this.nombre = nombre;
        this.lugarbase = lugarbase;
        this.tipo = tipo;
        this.lider = lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarbase() {
        return lugarbase;
    }

    public void setLugarbase(String lugarbase) {
        this.lugarbase = lugarbase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public SuperHumano getLider() {
        return lider;
    }

    public void setLider(SuperHumano lider) {
        this.lider = lider;
    }

    public ArrayList<SuperHumano> getSuperhumano() {
        return superhumano;
    }

    public void setSuperhumano(ArrayList<SuperHumano> superhumano) {
        this.superhumano = superhumano;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", lugarbase=" + lugarbase + ", tipo=" + tipo + ", lider=" + lider + ", superhumano=" + superhumano + '}';
    }

}
