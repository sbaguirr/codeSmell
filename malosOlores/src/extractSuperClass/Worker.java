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
public class Worker extends Employee{
    
    public Worker(float salary, float bonusPercentage, EmployeeType employeeType) {
        super(salary, bonusPercentage, employeeType);
    }

    @Override
    float calcularSalario(Employee e) {
        return month%2==0?e.getSalary():e.getSalary() + rmu/12*2;
    }

    @Override
    float CalculateYearBonus(Employee e) {
        return 0;
    }
    
}
