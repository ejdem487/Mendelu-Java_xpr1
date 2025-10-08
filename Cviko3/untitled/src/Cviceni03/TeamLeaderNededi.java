package Cviceni03;

public class TeamLeaderNededi{

    private int numOfTeamMembers;
    private Employee [] teamMembers;
    private Employee employee;

    public TeamLeaderNededi(String name, String surname, int maxNumOfTeamMembers) {
        employee = new Employee(name,surname,"já to tady řídím");
        teamMembers = new Employee [maxNumOfTeamMembers];
        numOfTeamMembers = 0;


    }

    boolean addTeamMember(Employee teamMember) {
        if (numOfTeamMembers < teamMembers.length) {
        teamMembers[numOfTeamMembers] = teamMember;
        numOfTeamMembers = numOfTeamMembers + 1;
        return true;
    }

    return false;
    }

    public static TeamLeaderNededi getNewTeamLeader(String name, String surname, String maxNumOfTeamMembers) {

        return new TeamLeaderNededi(name, surname, Integer.parseInt(maxNumOfTeamMembers));

    }


    public String getJobDescription() {
        StringBuffer sb = new StringBuffer();
        sb.append(employee.getJobDescription());
        sb.append("\nVedu tyto lidi:");
        for (int i = 0; i < numOfTeamMembers; i++) {
        sb.append("\n" + teamMembers[i].toString());
        }
        return sb.toString();
    }

    /*@Override
    public String toString() {
        return "Override test String toString";
    }*/
    @Override
    public String toString() {
        return String.format("Jsem %s %s, %s",employee.getName(),employee.getSurname(),getJobDescription());
    }


}
