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
public class doctor {
    private Departamento departamento1;
    public void setDepartamento(Departamento departamento1Para) {
        this.departamento1=departamento1Para;
    }
    public Departamento getDepartamento(){
        return departamento1;
    }
    private doctorando doctorando1;
    public void setdoctorando(doctorando doctorando1Para) {
        this.doctorando1=doctorando1Para;
    }
    public doctorando getdoctorando(){
        return doctorando1;
    }
    private Integer numero_maximo_de_tesis;
    
    
}
