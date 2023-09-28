public class Employee {
    private String name;
    private int id;
    private double salary;
    private double exp;

    public Employee(int id, String name, double salary, double exp) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", exp=" + exp + "]";
    }

}
