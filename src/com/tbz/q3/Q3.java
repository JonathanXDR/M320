package com.tbz.q3;

import java.util.Scanner;

public class Q3 {

    public static void Start() throws WrongInputExceptions {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        NotenListe notenListe = new NotenListe();


        while(true) {
            try {
                System.out.println("Note hinzufügen? (j/n)");
                String input = scanner.nextLine();
                while (!input.equals("j") && !input.equals("n")){
                    System.out.println("Antwort muss j/n sein");
                    input = scanner.nextLine();
                    if (input.equals("j") || input.equals("n")) break;
                }

                if (input.equals("j")) {
                    System.out.println("Fach:");
                    String fach = scanner.nextLine();
                    System.out.println("Note:");
                    int note = scanner.nextInt();
                    if(note < 1 || note > 6) throw new WrongInputExceptions("Note muss zwischen 1 und 6 sein");
                    scanner.nextLine();
                    notenListe.addNote(fach, note);
                } else if (input.equals("n")) {
                    break;
                }
            } catch (WrongInputExceptions e) {
                throw new WrongInputExceptions("Falsche Eingabe");
            }
        }
/*
        try {
            System.out.println("Note hinzufügen yes/no");
            String input = scanner.nextLine();
            while (input.equals("yes")) {


                System.out.println("Geben Sie ein Fach ein: ");
                String NewFach = scanner.nextLine();

                System.out.println("Geben Sie eine Note ein: ");
                int NewNote = scanner.nextInt();
                if (NewNote > 6 || NewNote < 1) {
                    throw new ArithmeticException("Note muss zwischen 1 und 6 liegen");
                }

                notenListe.addNote(NewFach, NewNote);


                System.out.println("Note hinzufügen yes/no");
                scanner.next();
                input = scanner.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Fehler");
        }
*/





        notenListe.printNotenListe();

    }
}

