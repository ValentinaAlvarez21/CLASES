/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Date;

/**
 *
 * @author sena
 */
public class Trabajador extends Persona{
    private Departamento departamento1;
    public void setDepartamento (Departamento departamento1Para) {
    this.departamento1=departamento1Para;
    }
    public Departamento getDepartamento(){
    return departamento1;
    }
     private Universidad universidad1;
    public void setUniversidad (Universidad universidad1Para) {
    this.universidad1=universidad1Para;
    }
    public Universidad getUniversidad(){
    return universidad1;
    }
    private Date Fecha_i_c;
 
    
    
}
