package Inheritance;

public class Programmer extends Job {

    public Programmer(float salary, int bonus) {
        super(salary, bonus);
    }

    public void getInfo(){
        System.out.println("Programmer’s salary is " + salary + " and bonus is " + bonus);
    }
}
