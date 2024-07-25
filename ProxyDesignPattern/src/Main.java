public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeDao dao = new EmployeeDaoProxy();
        dao.delete("ADMIN", 1);

        dao.delete("USER", 2);
    }
}
