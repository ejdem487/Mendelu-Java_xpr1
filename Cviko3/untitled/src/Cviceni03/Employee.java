package Cviceni03;

public class Employee {
    private  String name;
    private String surname;
    private String jobDescription;

    public Employee(String name, String surname, String jobDescription) {
        this.name = name;
        this.surname = surname;
        this.jobDescription = jobDescription;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    @Override
    public String toString() {
        return String.format("Jsem %s %s, %s",name,surname,getJobDescription());
    }
}
