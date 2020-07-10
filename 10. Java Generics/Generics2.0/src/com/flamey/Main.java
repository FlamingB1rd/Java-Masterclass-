package com.flamey;

public class Main {

    public static void main(String[] args)
    {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        FootballPlayer ivo = new FootballPlayer("Ivo");

        Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide Crows");
        Team<FootballPlayer> tarnovski = new Team<>("Tarnovski");
        adelaideCrows.addPlayer(joe);
        tarnovski.addPlayer(ivo);

        adelaideCrows.matchResult(tarnovski, 1, 3);
        System.out.println(tarnovski.compareTo(adelaideCrows));
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(ivo);

//        Team<String> broken = new Team<String>("This wont work");
//        broken.addPlayer("no1");
    }
}

