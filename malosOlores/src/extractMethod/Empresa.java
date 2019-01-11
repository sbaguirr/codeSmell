/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractMethod;

import parameterizedMethod.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    public List<Persona> personas;

    public Empresa() {
        personas = new ArrayList<Persona>();
    }

    public void MostrarInformacion(Persona person) {
        if (person instanceof Cliente) {
            System.out.println("Cliente: ");
        } else if (person instanceof Employee) {
            System.out.println("Empleado: ");
        }
        System.out.println("Nombre: " + person.Nombre + ", Apellido: " + person.Apellido + ", con numero de cedula: " + person.Cedula);
        System.out.println("Direccion: " + person.mostrarLocation());
        System.out.println("----------------------");
    }

    /*
    EXTRACT METHOD
    */
    public void GuardarCliente(Cliente c) {
        validarInformacion(c);     
        c.setLocation("Ecuador", "Guayaquil", "Guayas", "Alborada 3era etapa");
        this.personas.add(c);
        System.out.println(c.Nombre + " " + c.Apellido + " ha sido agregado como nuevo cliente");

    }

    /*
    EXTRACT METHOD
    */
    public void validarInformacion(Cliente c) {
        validarNombre(c.Nombre);
        validarApellido(c.Apellido);
        validarCedula(c.Cedula);

    }

    /*
    EXTRACT METHOD
    */
    private void validarNombre(String nombre) {
        if (nombre.equals("") && nombre.length() > 16) {
            System.out.println("ingreso de nombre incorrecto");
        } else {
            System.out.println("ingreso de nombre correcto");
        }
    }

    /*
    EXTRACT METHOD
    */
    private void validarApellido(String Apellido) {
        if (Apellido.equals("") && Apellido.length() > 16) {
            System.out.println("ingreso de apellido incorrecto");
        } else {
            System.out.println("ingreso de apellido correcto");
        }
    }

    /*
    EXTRACT METHOD
    */
    private void validarCedula(String Cedula) {
        if (!Cedula.equals("") && Cedula.length() < 10) {
            System.out.println("ingreso de cedula incorrecto");
        } else {
            System.out.println("ingreso de cedula correcto");

        }
    }

    public void mostrarTodo() {
        for (Persona person : this.personas) {
            MostrarInformacion(person);
        }

    }

}
