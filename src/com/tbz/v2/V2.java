package com.tbz.v2;

public class V2 {
    public void Start() {
        Team team = new Team() {
            @Override
            public void displayText() {
                super.displayText();
                System.out.println("new text");
            }
        };

        team.displayNames();

        team.displayText();
    }
}
