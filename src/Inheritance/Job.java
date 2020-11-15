package Inheritance;

public class Job {
    float salary;
    int bonus;

    enum Jobs {
        PROGRAMMER, TEACHER , DRIVER
    }

    public Job(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    public void getInfo(){
        System.out.println(" Programmer’s salary is " + salary + " and bonus is " + bonus);
    }
}
