/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3poo;

/**
 *
 * @author Practica
 */
public class Administrativo extends Persona {
    int salario;
    String salarioStr= String.valueOf(salario);

    public String getSalarioStr() {
        return salarioStr;
    }

    public void setSalarioStr(String salarioStr) {
        this.salarioStr = salarioStr;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Administrativo() {
    }

    public Administrativo(String salarioStr, String tipoID, String nroID, String nombres, String apellidos, String direccion) {
     
        this.salarioStr = salarioStr;
    }
    
     @Override
    public String toString() {
        return "Administrativo{" + "salario=" + salario + '}';
    }
    
    
}
