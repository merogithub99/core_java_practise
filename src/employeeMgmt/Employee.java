package employeeMgmt;

public class Employee {

    private short id;
    private String fullName;
    private float salary;
    private boolean active;

    public Employee(short id, String fullName, float salary, boolean active) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
        this.active = active;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", active=" + active +
                '}';
    }
}
