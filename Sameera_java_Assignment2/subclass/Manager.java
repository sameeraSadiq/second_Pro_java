
package subclass;
import superclass.Employee;

public class Manager extends Employee {
    @Override
    public double earnings() {
        double baseSalary = super.earnings(); 
        double bonus = 500.0; 
        return baseSalary + bonus;
    }
}
