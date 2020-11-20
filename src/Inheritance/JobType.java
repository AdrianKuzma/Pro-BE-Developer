package Inheritance;

public enum JobType {
    PROGRAMMER("Programmer"),
    TEACHER("Teacher"),
    DRIVER("Driver");

    public final String  name;

    JobType(String name) {
        this.name = name;
    }
}
