package com.tbz.q3;

import java.util.ArrayList;

public class NotenListe {
    private ArrayList<Note> NotenListe;

    public NotenListe() {NotenListe = new ArrayList<Note>();}

    public void addNote(String Fach, int Note) {NotenListe.add(new Note(Fach, Note));}


    public void printNotenListe() {
        for (Note note : NotenListe) {
            System.out.println(note.getFach() + " " + note.getNote());
        }
    }
}
