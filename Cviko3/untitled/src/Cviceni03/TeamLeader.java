package Cviceni03;

import java.util.ArrayList;

public class TeamLeader extends Employee {

    private int numOfTeamMembers;
    private Employee [] teamMembers;

    public TeamLeader(String name, String surname, int maxNumOfTeamMembers) {
        super(name,surname,"já to tady řídím");
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

    public static TeamLeader getNewTeamLeader(String name, String surname, String maxNumOfTeamMembers) {

        return new TeamLeader(name, surname, Integer.parseInt(maxNumOfTeamMembers));

    }

    @Override
    public String getJobDescription() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.getJobDescription());
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


}
