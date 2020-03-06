package solid_2011.live.srp;

public class EmployeeManagement {
    private double monthlySalary;
    private LeaveManagement leaveManagement;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public LeaveManagement getLeaveManagement() {
        return leaveManagement;
    }

    public EmployeeManagement() {
    }

    public EmployeeManagement(double monthlySalary, LeaveManagement leaveManagement) {
        this.monthlySalary=monthlySalary;
        this.leaveManagement=leaveManagement;
    }

    public int getYearsInOrg() {
        return leaveManagement.getLeavesLeftPreviously().length;
    }

}