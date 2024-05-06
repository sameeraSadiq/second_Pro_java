
import superclass.Employee;
import subclass.Manager;

public class Main {
    public static void main(String[] args) {
        // create employee object
        Employee emp = new Employee();
        System.out.println("Employee earnings: "+emp.earnings()+"$");

        // create manager object
        Manager mag = new Manager();
        System.out.println("Manager earnings: "+mag.earnings()+"$");
    }
}
