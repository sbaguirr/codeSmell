/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractSuperClass;

import conmalolor.EmployeeType;

/**
 *
 * @author Rosy
 */
public class Supervisor extends Employee{

    public Supervisor(float salary, float bonusPercentage, EmployeeType employeeType) {
        super(salary, bonusPercentage, employeeType);
    }

    @Override
    float calcularSalario(Employee e) {
        float valueS = e.getSalary() + (e.getBonusPercentage() * 0.5F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
        return month%2==0?valueS:valueS + rmu/12*2;
    }

    @Override
    float CalculateYearBonus(Employee e) {
        return e.getSalary()+ e.getSalary()* 0.7F;
    }
    
}
