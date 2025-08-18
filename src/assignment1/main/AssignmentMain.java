package assignment1.main;

import assignment1.employees.*;
import assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Developer dev = new Developer("Akshay", 250.0, "Java");
        Manager mgr = new Manager("Dia", 300.0, 5);

        System.out.println("Before Increment:");
        EmployeeUtilities.displayEmployeeDetails(dev);
        EmployeeUtilities.displayEmployeeDetails(mgr);

        // Increase salary
        EmployeeUtilities.increaseHourlyRate(dev, 50);
        EmployeeUtilities.increaseHourlyRate(mgr, 75);

        System.out.println("\nAfter Increment:");
        EmployeeUtilities.displayEmployeeDetails(dev);
        EmployeeUtilities.displayEmployeeDetails(mgr);
    }
}
