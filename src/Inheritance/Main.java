package Inheritance;
import Inheritance.Model.Driver;
import Inheritance.Model.Job;
import Inheritance.Model.Programmer;
import Inheritance.Model.Teacher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main
{
    public static void main(String[] args) {
        Programmer pr1 = new Programmer( 1700 , 200);
        Teacher tc1 = new Teacher( 900 , 300);
        Driver dv1 = new Driver(1000 , 300);

        List<Job> list = new ArrayList<>(Arrays.asList(pr1,tc1,dv1));
        EmployeeService x = new EmployeeServiceImpl();
        list.forEach(n -> System.out.println(n.getInfo()));
        x.totalSalary(list);
        x.totalBonus(list);
        }
    }
