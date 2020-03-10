/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icon
 */
public class P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int employeeId, String employeeTitle, String firstName, String lastName, String dateOfBirth, String NINumber, String[] jobTitles, String jobDepartment
        SalariedEmployee salariedEmployee = new SalariedEmployee(1234, "Mr", "Eric", "Murithi", "1995-03-29", "452FC", new String[]{"Supervisor", "Team Leader"}, "Marketing");
        HourlyEmployee hourlyEmployee = new HourlyEmployee(1235, "Mr", "Patrick", "Kosewe", "1996-03-29", "472FC", new String[]{"Director", "Team Leader"}, "Sales");
        SalariedEmployee commissionedEmployee = new SalariedEmployee(1236, "Mrs", "Jecinta", "Waothaya", "1997-03-29", "454DC", new String[]{"Manager", "Oficcer", "Supervisor"}, "Production");
    
        List<Employee> employees = new ArrayList<>();
        employees.add(salariedEmployee);
        employees.add(hourlyEmployee);
        employees.add(commissionedEmployee);
        
        salariedEmployee.getAnnualSalary();
        
    }
    
}
