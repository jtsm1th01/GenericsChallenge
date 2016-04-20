package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BaseballTeam astros = new BaseballTeam("Astros");
        BaseballTeam angels = new BaseballTeam("Angels");
        FootballTeam texans = new FootballTeam("Texans");

        League<BaseballTeam> american = new League<>("American League");
        League<FootballTeam> afc = new League<>("AFC South");

        american.addTeam(astros);
        afc.addTeam(texans);
        american.addTeam(astros);
        american.addTeam(angels);
        angels.wins = 2;
        angels.games = 3;
        astros.wins = 3;
        astros.games = 3;

        ArrayList<BaseballTeam> team = american.getTeams();
        ArrayList<FootballTeam> team2 = afc.getTeams();

        afc.printTeams();
        american.printTeams();

        System.out.println(angels.getRanking());
        System.out.println(astros.getRanking());

        afc.addTeam(texans);
        american.addTeam(astros);
    }
}
