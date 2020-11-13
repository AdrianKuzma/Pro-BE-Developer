package Inheritance;

class Main
{
    public static void main(String[] args) {
        Programmer pr1 = new Programmer( 1700 , 200 );
        Teacher tc1 = new Teacher( 900 , 300);
        Driver dv1 = new Driver(1000 , 300);
        pr1.getInfo();
        tc1.getInfo();
        dv1.getInfo();
    }
    //Zatial iba 1. cvičenie , pracujem na enumu
}