/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameterizedMethod;
import java.util.ArrayList;
import java.util.List;




public class Empresa {
    
    public List<Persona> personas;
    
    public Empresa(){
       personas= new ArrayList<Persona>();
    }
    /**
     * METODO PARAMETRIZADO
     * @param person 
     */
    public void MostrarInformacion(Persona person){
        if(person instanceof Cliente){
        System.out.println("Cliente: ");
        } else if(person instanceof Employee){
        System.out.println("Empleado: ");
        }
        System.out.println("Nombre: " + person.Nombre + ", Apellido: " + person.Apellido + ", con numero de cedula: " + person.Cedula );
        System.out.println("Direccion: " + person.mostrarLocation());
        System.out.println("----------------------");
    }
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        if(Nombre.equals("") && Nombre.length()> 16){
                System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");

        }
        if(Apellido.equals("") && Apellido.length()> 16){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");

        }
        if(!Cedula.equals("") && Cedula.length()< 10){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");

        }
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        cliente.setLocation("Ecuador", "Guayaquil", "Guayas", "Alborada 3era etapa");
        this.personas.add(cliente);
        System.out.println(Nombre +" " + Apellido + " ha sido agregado como nuevo cliente");
        
    }
    
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        if(Nombre.equals("") && Nombre.length()> 16){
            System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");
            
        }
        if(Apellido.equals("") && Apellido.length()> 16){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");
            
        }
        if(!Cedula.equals("") && Cedula.length()< 10){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");
            
        }
        
    }
    
    /**
     * 
     */
    public void mostrarTodo() {
        for(Persona person : this.personas){
             MostrarInformacion(person);           
        }
    }
    
    
}
