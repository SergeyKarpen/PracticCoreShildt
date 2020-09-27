package main.java.com.sergeykarpen.javacore.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamCar {
    private List<TeamMember> teamMemberList = new ArrayList<>();

    public void addTeamMember (TeamMember teamMember) {
        teamMemberList.add(teamMember);
    }

    public void removeTeamMember (TeamMember teamMember) {
        teamMemberList.remove(teamMember);
    }

    public void createTeamCar () {
        System.out.println("Какие обязанности у группы в автомобиле:");
        for (TeamMember teamMember: teamMemberList) {
            teamMember.positionCar();
        }
    }

}
