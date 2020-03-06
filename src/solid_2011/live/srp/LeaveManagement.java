package solid_2011.live.srp;

public class LeaveManagement {
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int[] leavesLeftPreviously;

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public void setTotalLeaveAllowed(int totalLeaveAllowed) {
        this.totalLeaveAllowed = totalLeaveAllowed;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    public LeaveManagement(int leavesTaken, int[] leavesLeftPreviously) {
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.totalLeaveAllowed = TOTAL_LEAVES_ALLOWED;
    }

    public LeaveManagement() {
    }
}