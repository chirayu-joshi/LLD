package example1;

/*
* EmployeeFacade is exposing only those methods which are required by EmployeeClient
* */
public class EmployeeFacade {
    private final EmployeeDao employeeDao;

    public EmployeeFacade() {
        this.employeeDao = new EmployeeDao();
    }

    public void insert() {
        this.employeeDao.insert();
    }

    public Employee getEmployeeDetails(int employeeId) {
        return this.employeeDao.getEmployeeDetails(employeeId);
    }
}
