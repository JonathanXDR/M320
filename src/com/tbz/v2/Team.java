package com.tbz.v2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team {
    private ArrayList<Player> team = new ArrayList<>();

    public Team(){
        team.add(new Goalkeeper("Urs"));

        team.add(new Striker("Aron"));
        team.add(new Striker("Boris"));
        team.add(new Striker("Cedric"));
        team.add(new Striker("Dennis"));
        team.add(new Striker("Elias"));
        team.add(new Striker("Felix"));
        team.add(new Striker("Gustav"));
        team.add(new Striker("Hans"));
        team.add(new Striker("Ivan"));
        team.add(new Striker("Johannes"));
        team.add(new Striker("Karl"));
        team.add(new Striker("Lukas"));
        team.add(new Striker("Max"));
        team.add(new Striker("Niklas"));
        team.add(new Striker("Oskar"));
        team.add(new Striker("Paul"));

        team.add(new Defender("Quentin"));
        team.add(new Defender("Raphael"));
        team.add(new Defender("Samuel"));
        team.add(new Defender("Tobias"));
    }
}
