package com.flamey;

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

public class Main
{
    public static void main(String[] args)
    {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> tar = new Team<>("Tar");
        Team<FootballPlayer> bar = new Team<>("Bar");
        Team<FootballPlayer> far = new Team<>("Far");
        Team<FootballPlayer> zar = new Team<>("Zar");

        tar.matchResult(bar, 1, 2);
        bar.matchResult(zar, 7, 6);
        far.matchResult(tar, 9, 0);

        footballLeague.add(tar);
        footballLeague.add(bar);
        footballLeague.add(far);
        footballLeague.add(zar);

        footballLeague.showLeagueTable();

    }
}
