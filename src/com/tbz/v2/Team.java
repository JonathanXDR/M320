package com.tbz.v2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team {
    private ArrayList<Player> team = new ArrayList<>();

    public Team(){
        team.add(new Goalkeeper(""));

        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));
        team.add(new Striker(""));

        team.add(new Defender(""));
        team.add(new Defender(""));
        team.add(new Defender(""));
        team.add(new Defender(""));
    }
}
