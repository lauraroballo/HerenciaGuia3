/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3poo;

/**
 *
 * @author Practica
 */
public class Estudiante extends Persona{  
    String codigo;
    
    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + '}';
    }
    public boolean pagarMatricula(){
        return true;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public Estudiante() {
    }
    public Estudiante(String codigo) {
        this.codigo = codigo;
    }
    public Estudiante(String codigo, String tipoID, String nroID, String nombres, String apellidos, String direccion) {
        
        this.codigo = codigo;
    }   
}
