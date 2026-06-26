package model;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private double salary;
    private String email;

    public Employee(int employeeId, String employeeName, String department, double salary, String email) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.email = email;
    }

    public int getemployeeId() {
        return employeeId;
    }

    public void setemployeeid(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getemployeeName() {
        return employeeName;
    }

    public void setemployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }

}
