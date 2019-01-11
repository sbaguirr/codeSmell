/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractSuperClass;

import conmalolor.EmployeeType;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public abstract class Employee extends Persona{   

    final float rmu = (float) 386.0;
    //salario del employee
    private float salary;
    //porcentaje de bonus
    private float bonusPercentage;    
    //variable de tipo employeeType
    private EmployeeType employeeType;    

    abstract float calcularSalario(Employee e);
    abstract float CalculateYearBonus(Employee e);
    Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        
    public Employee(float salary, float bonusPercentage, EmployeeType employeeType)    
    {        
        super("Descconocido","Descconocido","0000000000");
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.employeeType = employeeType;
        this.setLocation("Ecuador", "Gye", "Guayas", "ESPOL Prosperina");
    }
    
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
     
    
}
