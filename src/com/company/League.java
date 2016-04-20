package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by travis on 4/12/16.
 */
public class League<T extends Team> {

    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T newTeam) {
        if(this.teams.contains(newTeam)) {
            System.out.println("The " + newTeam.getName() + " are already in the league.");
            return false;
        } else {
            this.teams.add(newTeam);
            System.out.println("The " + newTeam.getName() + " have been added to the league.");
            return true;
        }
    }

    public ArrayList getTeams() {
        return teams;
    }

    public String getName() {
        return name;
    }

    public void printTeams() {
        Collections.sort(teams);
        System.out.println(this.getName() + " Standings ---");
        for(T team: teams) {
            System.out.println(team.getName());
        }
    }


}
