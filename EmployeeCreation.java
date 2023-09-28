public class EmployeeCreation {

    private static int randnum = 1001;

    public static Employee createEmployee(String name, double salary, double exp) {
        Employee e = new Employee(randnum++, name, salary, exp);
        return e;
    }

}