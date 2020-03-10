/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p;

/**
 *
 * @author icon
 */
public class SalariedEmployee extends Employee {

    private String type;
    private double annualSalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(int employeeId, String employeeTitle, String firstName, String lastName, String dateOfBirth, String NINumber, String[] jobTitles, String jobDepartment) {
        super(employeeId, employeeTitle, firstName, lastName, dateOfBirth, NINumber, jobTitles, jobDepartment);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

}
