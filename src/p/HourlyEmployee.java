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
public class HourlyEmployee extends Employee {

    private double hourlyRate;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int employeeId, String employeeTitle, String firstName, String lastName, String dateOfBirth, String NINumber, String[] jobTitles, String jobDepartment) {
        super(employeeId, employeeTitle, firstName, lastName, dateOfBirth, NINumber, jobTitles, jobDepartment);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}
