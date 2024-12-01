package SalaryManagement;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter an Employee number (1001, 1002, 1003, 1004):");
        long employeeid = s.nextLong();
        
        System.out.println("Enter hour Salary:");
        long hourSalary = s.nextLong();
        
        System.out.println("Enter weekly time in hours:");
        long weeklyTime = s.nextLong();
        
        
        // Create an instance of Elements
         Elements employee = new Elements(employeeid, null, hourSalary, weeklyTime);
        
        // Display employee name and total pay
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Total Pay: " + employee.getTotalPay());
        System.out.println("Weekly Salary: " + employee.getWeekSalary());
 


    


      
        s.close();
    }
}
