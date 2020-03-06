package solid_2011.live.srp;

public class EmployeeInfo {
    private int empId;
    private String manager;

    public EmployeeInfo(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }


    public EmployeeInfo() {
    }
}