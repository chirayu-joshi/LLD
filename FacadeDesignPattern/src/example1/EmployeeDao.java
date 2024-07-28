package example1;

/*
* EmployeeDao contains all types of methods which may not be required by EmployeeClient
* */
public class EmployeeDao {
    public void insert() {
        // Inserting into employee table
    }

    public void updateEmployeeName() {
        // Updating employee name
    }

    public Employee getEmployeeDetails(String emailId) {
        // Get employee details from DB based upon emailId
        return new Employee();
    }

    public Employee getEmployeeDetails(int employeeId) {
        // Get employee details from DB based upon employeeId
        return new Employee();
    }
}
