package solid_2011.live.srp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 20, 2011
 * Time: 1:56:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {

    private PersonalInfo personalInfo;
    private EmployeeInfo employeeInfo;
    private EmployeeManagement employeeManagement;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.employeeInfo = new EmployeeInfo(empId);
        this.personalInfo = new PersonalInfo(name,new Address(addressStreet, addressCity, addressCountry));
        this.employeeManagement = new EmployeeManagement(monthlySalary,new LeaveManagement(leavesTaken,leavesLeftPreviously));
    }

    public Employee() {
    }

    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employeeInfo.getEmpId() + "'>" +
                "<span>" + personalInfo.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employeeManagement.getLeaveManagement().getTotalLeaveAllowed() - employeeManagement.getLeaveManagement().getLeavesTaken()) + "</span>";
        str += "<span>" + Math.round(employeeManagement.getMonthlySalary() * 12) + "</span>";
        if (employeeInfo.getManager() != null) str += "<span>" + employeeInfo.getManager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (employeeManagement.getYearsInOrg() < 3) {
            years = employeeManagement.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += employeeManagement.getLeaveManagement().getLeavesLeftPreviously()[employeeManagement.getYearsInOrg() -i-1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
    //other method related to customer
}
