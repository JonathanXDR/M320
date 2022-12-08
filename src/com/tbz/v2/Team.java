package com.tbz.v2;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players = new ArrayList<>();

    public Team(){
        players.add(new Goalkeeper("Urs"));

        players.add(new Striker("Aron"));
        players.add(new Striker("Boris"));
        players.add(new Striker("Cedric"));
        players.add(new Striker("Dennis"));
        players.add(new Striker("Elias"));
        players.add(new Striker("Felix"));
        players.add(new Striker("Gustav"));
        players.add(new Striker("Hans"));
        players.add(new Striker("Ivan"));
        players.add(new Striker("Johannes"));
        players.add(new Striker("Karl"));
        players.add(new Striker("Lukas"));
        players.add(new Striker("Max"));
        players.add(new Striker("Niklas"));
        players.add(new Striker("Oskar"));
        players.add(new Striker("Paul"));

        players.add(new Defender("Quentin"));
        players.add(new Defender("Raphael"));
        players.add(new Defender("Samuel"));
        players.add(new Defender("Tobias"));
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void  displayNames() {
        for (var player : players){
            player.displayName();
        }
    }
    public void displayText(){
        System.out.println("old text");
    }
}
