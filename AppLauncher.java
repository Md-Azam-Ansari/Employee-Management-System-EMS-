
import java.util.Scanner;

public class AppLauncher {

    private Company com = new Company("JSpider", "BTM Bengaluru");
    private Scanner scan = new Scanner(System.in);

    public void menuItems() {
        System.out.println("Welcome to " + com.getName() + " company");
        System.out.println("Options ");
        System.out.println("-----------------------------------");
        System.out.println("Select 1 to add new employee");
        System.out.println("Select 2 to view employee details");
        System.out.println("Select 3 to search employee by id");
        System.out.println("Select 4 to update employee salary");
        System.out.println("Select 5 to delete employee record");
        System.out.println("Select 6 to view employee count");
        System.out.println("Select 7 to exit from app");
        System.out.println("------------------------------------");
    }

    public void launch() {
        while (true) {
            menuItems();
            int choice = scan.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter employee name");
                    String name = scan.nextLine();
                    name = scan.nextLine();
                    System.out.println("Enter employee salary");
                    double salary = scan.nextDouble();
                    System.out.println("enter employee experience");
                    double exp = scan.nextDouble();
                    Employee e = EmployeeCreation.createEmployee(name, salary, exp);
                    com.addEmployee(e);
                    System.out.println("Adding Employee Successfull");
                    System.out.println("-----------------------------");
                    break;

                case 2:
                    com.viewAllEmployeesDetails();
                    break;

                case 3:
                    System.out.println("Enter employee id");
                    int eid = scan.nextInt();
                    if (com.getTotalEmployees() == 0) {
                        System.out.println("First add employee to search");
                    } else {
                        Employee emp = com.searchEmployee(eid);
                        try {
                            System.out.println(
                                    emp.getId() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getExp());
                        } catch (NullPointerException exp1) {
                            System.out.println("No Employee with this id");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter employee id");
                    int eid1 = scan.nextInt();
                    System.out.println("Enter new Salary");
                    double newSalary = scan.nextDouble();
                    com.updateSalary(eid1, newSalary);
                    break;

                case 5:
                    System.out.println("Enter employee id");
                    int empid = scan.nextInt();
                    com.removeEmployee(empid);
                    break;

                case 6:
                    System.out.println("Total Employee: " + com.getTotalEmployees());
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    menuItems();
            }
        }
    }
}
