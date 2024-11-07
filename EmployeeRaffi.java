abstract class Employee{
    abstract void work();
}

class Manager extends Employee{
    @Override
    void work() {
        System.out.println("Manager is managing tasks");
    }
}

class Developer extends Employee{
    @Override
    void work() {
        System.out.println("Developer is writing code");
    }
}

public class EmployeeRaffi {
    public static void assignTask(Employee employee) {
        employee.work();
    }

    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();

        assignTask(manager);
        assignTask(developer);
    }
}
