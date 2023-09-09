/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3poo;
public class Persona {
    String tipoID;
    String nroID;
    String nombres;
    String apellidos;
    String direccion;
    public Persona() {   
    }
    public Persona(String tipoID, String nroID, String nombres, String apellidos, String direccion) {
        this.tipoID = tipoID;
        this.nroID = nroID;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }   
    public String getTipoID() {
        return tipoID;
    }

    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }

    public String getNroID() {
        return nroID;
    }

    public void setNroID(String nroID) {
        this.nroID = nroID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "tipoID=" + tipoID + ", nroID=" + nroID + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + '}';
    }
    
}
