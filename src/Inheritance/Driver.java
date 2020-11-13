package Inheritance;

public class Driver extends  Job{

    public Driver(float salary, int bonus) {
        super(salary, bonus);
    }
    public void getInfo(){
        System.out.println("Drivers’s salary is " + salary + " and bonus is " + bonus);
    }
}
