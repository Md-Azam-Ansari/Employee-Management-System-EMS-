
import java.util.ArrayList;

public class Company {
    String name;
    String address;
    private ArrayList<Employee> empList = new ArrayList<Employee>();

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // javadocs
    /**
     * this method is used to add new employee details in the record
     * 
     * @param e reference of the employee object
     */
    public void addEmployee(Employee e) {
        empList.add(e);
    }

    /**
     * this method is used to search an employee based on id if found,
     * returns the reference otherwise return null
     * 
     * @param id of the employee to be search
     * @return
     */
    public Employee searchEmployee(int id) {
        Employee emp = null;
        for (Employee e : empList) {
            if (e.getId() == id) {
                emp = e;
                break;
            }
        }

        return emp;
    }

    /**
     * this method is used to update salary based on id of the employee
     * 
     * @param id     of the employee
     * @param salary to be updated
     */
    public void updateSalary(int id, double salary) {
        Employee foundEmp = searchEmployee(id);
        if (foundEmp != null) {
            foundEmp.setSalary(salary);
        } else {
            System.out.println("Employee by the given ID not found in the records");
        }
    }

    /**
     * this method is used to remove the employee details from the list
     * 
     * @param id of the employee to be removed
     */
    public void removeEmployee(int id) {
        Employee foundemp = searchEmployee(id);
        if (foundemp != null) {
            empList.remove(foundemp);
        } else {
            System.out.println("Employee by the given id not found in the records");
        }
    }

    /**
     * this method returns total no of employees in the companny
     * 
     * @return int value
     */
    public int getTotalEmployees() {
        return empList.size();
    }

    void viewAllEmployeesDetails() {
        System.out.println("----------------------------");
        System.out.println("Id\tName\tSalary\tExp");
        System.out.println("-----------------------------");
        for (Employee e : empList) {
            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
        }
    }
}