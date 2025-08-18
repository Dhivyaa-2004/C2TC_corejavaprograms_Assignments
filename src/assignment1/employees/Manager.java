package assignment1.employees;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double hourlyRate, int teamSize) {
        super(name, hourlyRate);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
