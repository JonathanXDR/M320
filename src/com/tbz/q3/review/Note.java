package com.tbz.q3;

public class Note {
    private String Fach;
    private int Note;


    public Note (String Fach, int Note) {
        this.Fach = Fach;
        this.Note = Note;
    }

    public String getFach() {return Fach;}
    public int getNote() {return Note;}
}
