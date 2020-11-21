package Inheritance;

public class Programmer extends Job {

    public Programmer(float salary, int bonus) {
        super(salary, bonus, JobType.PROGRAMMER);
    }

}
