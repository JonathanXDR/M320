package com.tbz.v2;
/**
 Die Striker Klasse stellt einen Stürmer im Spiel dar.
 @package com.tbz.v2
 @extends Player
 */
public class Striker extends Player {
    /**
     * Konstruktor für einen neuen Stürmer.
     *
     * @param name der Name des Stürmers
     */
    public Striker(String name){
        this.setName(name);
    }
    /**
     * Führt ein Joggen-Training des Stürmers aus.
     */
    public void jogTraining() {

    };
    /**
     * Gibt den Namen des Stürmers zurück.
     *
     * @return der Name des Stürmers
     * @override
     */
    @Override
    public String getName() {
        return super.getName();
    }
}