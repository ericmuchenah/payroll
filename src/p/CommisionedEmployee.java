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
public class CommisionedEmployee extends Employee{

    private double grossAnnualSalary, commissionRate;

    public CommisionedEmployee() {
    }

    public CommisionedEmployee(int employeeId, String employeeTitle, String firstName, String lastName, String dateOfBirth, String NINumber, String[] jobTitles, String jobDepartment) {
        super(employeeId, employeeTitle, firstName, lastName, dateOfBirth, NINumber, jobTitles, jobDepartment);
    }

    public double getGrossAnnualSalary() {
        return grossAnnualSalary;
    }

    public void setGrossAnnualSalary(double grossAnnualSalary) {
        this.grossAnnualSalary = grossAnnualSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

}
