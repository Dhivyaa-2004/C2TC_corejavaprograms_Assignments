package assignment1.employees;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double hourlyRate, String programmingLanguage) {
        super(name, hourlyRate);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
