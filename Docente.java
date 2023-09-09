/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3poo;

/**
 *
 * @author Practica
 */
public class Docente extends Persona{

    public Docente(String escalafon, String tipoID, String nroID, String nombres, String apellidos, String direccion) {
       
        this.escalafon = escalafon;
    }

   public Docente() {
    }

    @Override
    public String toString() {
        return "Docente{" + "escalafon=" + escalafon + '}';
    }
    String escalafon;

    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }

}
