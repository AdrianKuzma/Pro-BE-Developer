package Inheritance;

class Main
{
    public static void main(String[] args) {
        Programmer pr1 = new Programmer( 1700 , 200, JobType.PROGRAMMER );
        Teacher tc1 = new Teacher( 900 , 300, JobType.TEACHER);
        Driver dv1 = new Driver(1000 , 300, JobType.DRIVER);
        pr1.getInfo();
        tc1.getInfo();
        dv1.getInfo();
    }

}