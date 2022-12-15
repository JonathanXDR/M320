package com.tbz.v2;
/**
 Die Player Klasse stellt einen Fußballspieler dar.
 @package com.tbz.v2
 */
public class Player {
    /**
     * Der Name des Spielers.
     */
    private String name;
    /**
     * Gibt den Namen des Spielers zurück.
     *
     * @return der Name des Spielers
     */
    public String getName() {
        return name;
    }
    /**
     * Setzt den Namen des Spielers.
     *
     * @param name der Name des Spielers
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gibt den Namen des Spielers auf der Konsole aus.
     */
    public void displayName() {
        System.out.println(name);
    }
}