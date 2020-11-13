package Inheritance;

public class Teacher extends Job{


    public Teacher(float salary, int bonus) {
        super(salary, bonus);
    }

    public void getInfo(){
        System.out.println("Teacher’s salary is " + salary + " and bonus is " + bonus);
    }
}
