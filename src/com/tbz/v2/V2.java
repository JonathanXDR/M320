package com.tbz.v2;

/**
 Die V2 Klasse startet das Spiel und führt verschiedene Aktionen aus.
 @package com.tbz.v2
 */
public class V2 {
    // Startet das Spiel und führt verschiedene Aktionen aus.
    public void Start() {
        // Erstelle ein neues Team
        Team team = new Team() {
             /*
             * Überschreibt die displayText Methode des Teams, um zusätzlich den Text "new text" auf der Konsole auszugeben.
             *
             * @override
             */
            @Override
            public void displayText() {
                // Rufe die displayText Methode des Teams auf
                super.displayText();
                // Gib den Text "new text" auf der Konsole aus
                System.out.println("new text");
            }
        };
        // Gib die Namen aller Spieler im Team auf der Konsole aus
        team.displayNames();
        // Gib den Text "old text" und "new text" auf der Konsole aus
        team.displayText();
    }
}