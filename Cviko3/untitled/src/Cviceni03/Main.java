package Cviceni03;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Employee employee = new Employee("Michal","Jan","Uklizim");
        Employee employee2   = new Employee("Vojtěch","Supret","Ridim");
        TeamLeader teamLeader = new TeamLeader("Ondrej","Mandrous",5);
        teamLeader.addTeamMember(employee);
        teamLeader.addTeamMember(employee2);
        System.out.println(teamLeader.toString());
    }
}
