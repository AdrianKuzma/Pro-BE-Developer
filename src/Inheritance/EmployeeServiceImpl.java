package Inheritance;
import Inheritance.Model.Job;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public float totalSalary(List<Job> list) {
        int x = list.stream().mapToInt(i -> (int) i.getSalary()).sum();
        System.out.println("Total salary is:" + x);
        return x;
    }

    @Override
    public int totalBonus(List<Job> list) {
       int x = list.stream().mapToInt(Job::getBonus).sum();
        System.out.println("Total bonus is:" + x);
        return x;
    }
}
