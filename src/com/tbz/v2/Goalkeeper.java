package com.tbz.v2;
/**
 Die Goalkeeper Klasse stellt einen Torwart im Spiel dar.
 @package com.tbz.v2
 @extends Player
 */
public class Goalkeeper extends Player{
    /**
     * Die Größe des Torwarts in Metern.
     */
    private double size;
    /**
     * Konstruktor für einen neuen Torwart.
     *
     * @param name der Name des Torwarts
     */
    public Goalkeeper(String name){
        this.setName(name);
    }
    /**
     * Gibt die Größe des Torwarts zurück.
     *
     * @return die Größe des Torwarts in Metern
     */
    public double getSize() {
        return size;
    }
    /**
     * Setzt die Größe des Torwarts.
     *
     * @param size die Größe des Torwarts in Metern
     */
    public void setSize(double size) {
        this.size = size;
    }
}