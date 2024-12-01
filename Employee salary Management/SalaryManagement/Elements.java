package SalaryManagement;

public class Elements {
    private long employeeid;
    private String employeeName;
    private long hourSalary,weeklyTime;
    private  long totalPay;
    private  long weekSalary;
    private long regularPay;
    private long overtimePay;

    Elements(long employeeid, String employeeName, long hourSalary, long weeklyTime){
        this.employeeid = employeeid;
        this.employeeName = employeeName;
        this.hourSalary = hourSalary;
        this.weeklyTime = weeklyTime;
        this.weekSalary = 0;
        this.regularPay = 0;
        this.overtimePay = 0;
       this.salaryFoundation();


    }

   
    void salaryFoundation() {
        if (this.employeeid == 1001) { 
            employeeName = "Vash";
        } else if (this.employeeid == 1002) { 
            employeeName = "Jaspher";        
        } else if (this.employeeid == 1003) {
            employeeName = "Hotdog";
        } else if (this.employeeid == 1004) {
            employeeName = "Rafael";
        } else {
            employeeName = "Unknown Employee"; 
        }

        if (weeklyTime <= 40) {
            regularPay = weeklyTime * hourSalary;
            
        }else{

            regularPay = 40 * hourSalary;
           overtimePay = (long)((weeklyTime - 40) * hourSalary * 1.5);

        }
 totalPay = regularPay + overtimePay;
 weekSalary = regularPay;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }

    public long getTotalPay() {
        return totalPay;
    }

    public long getWeekSalary() {
        return weekSalary;
    }
   





    
}
