class Employee {
    int empId;
    String empName;

    Employee(int id, String name) {
        empId = id;
        empName = name;
    }

    void show() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

public class EmployeeDemo{
    public static void main(String[] args) {
        Employee e1 = new Employee(201, "Ravi");
        e1.show();
    }
}