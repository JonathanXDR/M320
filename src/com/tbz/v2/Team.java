package com.tbz.v2;
import java.util.ArrayList;
/**
 Die Team Klasse stellt ein Fußballteam dar.
 @package com.tbz.v2
 @import java.util.ArrayList
 */
public class Team {
    /**
     * Eine Liste aller Spieler im Team.
     */
    private ArrayList<Player> players = new ArrayList<>();

    /**
     * Konstruktor für ein neues Team. Fügt automatisch einen Torwart und eine bestimmte Anzahl von Stürmern und Verteidigern hinzu.
     */
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

    /**
     * Gibt eine Liste aller Spieler im Team zurück.
     *
     * @return die Liste aller Spieler im Team
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Gibt die Namen aller Spieler im Team auf der Konsole aus.
     */
    public void  displayNames() {
        for (var player : players){
            player.displayName();
        }
    }

    /**
     * Gibt den Text "old text" auf der Konsole aus.
     */
    public void displayText(){
        System.out.println("old text");
    }
}