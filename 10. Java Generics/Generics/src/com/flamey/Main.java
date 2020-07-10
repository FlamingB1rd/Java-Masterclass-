package com.flamey;

public class Main {

    public static void main(String[] args)
    {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer ivo = new SoccerPlayer("Ivo");

        Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(ivo);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<String> broken = new Team<String>("This wont work");
        broken.addPlayer("no1");
     }
}
