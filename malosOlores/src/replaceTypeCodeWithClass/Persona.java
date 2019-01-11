/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replaceTypeCodeWithClass;

/**
 *
 * @author Tiffy
 */
public class Persona {
    
    protected String Nombre;
    protected String Apellido;
    protected String Cedula;
    protected Location locationActual;
    protected String telefono;

    public Persona() {
    }
      public Persona(String Nombre, String Apellido, String Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String mostrarLocation() { 
        return locationActual.toString();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
     public void setLocation(Location nuevaLocacion){
        this.locationActual= nuevaLocacion;
    }
    
}
