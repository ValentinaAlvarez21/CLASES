/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author sena
 */
public class doctorando extends alumno {
    private Departamento departamento1;
    public void setDepartamento(Departamento departamento1Para) {
        this.departamento1=departamento1Para;
    }
    public Departamento getDepartamento(){
        return departamento1;
    }
    private String programa;
    
}
