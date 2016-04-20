package com.company;

/**
 * Created by travis on 4/12/16.
 */
public abstract class Team<T> implements Comparable<Team<T>> {

    private String name;
    public double games = 0;
    public double wins = 0;
    private double losses = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getRanking() {
        if(games == 0 && wins == 0) {
            return 0.0;
        } else {
            return (wins / games);
        }
    }

    @Override
    public int compareTo(Team<T> o) {
        if(getRanking() > o.getRanking()) {
            return -1;
        } else if(getRanking() == o.getRanking()) {
            return this.getName().compareTo(o.getName());
        } else {
            return 1;
        }
    }
}
