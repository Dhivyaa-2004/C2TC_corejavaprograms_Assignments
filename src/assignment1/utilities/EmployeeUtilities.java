package assignment1.utilities;

import assignment1.employees.Employee;

public class EmployeeUtilities {

    // Method to increase hourly rate
    public static void increaseHourlyRate(Employee emp, double increment) {
        emp.setHourlyRate(emp.getHourlyRate() + increment);
    }

    // Method to display employee details
    public static void displayEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("Hourly Rate: " + emp.getHourlyRate());
    }
}
