/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtractSuperClass;

import conmalolor.EmployeeType;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Employee extends Persona{   

    private final float rmu = (float) 386.0;
    //salario del employee
    private float salary;
    //porcentaje de bonus
    private float bonusPercentage;    
    //variable de tipo employeeType
    private EmployeeType employeeType;    

    public Employee(float salary, float bonusPercentage, EmployeeType employeeType)    
    {        
        super("Descconocido","Descconocido","0000000000");
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.employeeType = employeeType;
        this.setLocation("Ecuador", "Gye", "Guayas", "ESPOL Prosperina");
    }
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public float cs()
    {
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        switch (employeeType)         
        {
            case Worker:
                //Si el mes es impar entonces le entrega el decimo junto con su salario
                return month%2==0?salary:salary + rmu/12*2;
            case Supervisor:
                float valueS = salary + (bonusPercentage * 0.5F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
                return month%2==0?valueS:valueS + rmu/12*2;
            case Manager:
                float valueM = salary + (bonusPercentage * 0.7F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
                return month%2==0?valueM:valueM + rmu/12*2;
        }
        return 0.0F;
    }
    //calcula el bonus anual
    public float CalculateYearBonus() 
    {
        switch (employeeType)
        {
            case Worker:
                return 0;
            case Supervisor:
                return salary + salary * 0.7F;
            case Manager:
                return salary + salary * 1.0F;
        }
        return 0.0F;
    }
     
}
