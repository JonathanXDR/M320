package com.tbz.v1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class V1 {
    public void Start() {
        ArrayList<Media> mediaList = new ArrayList<>();

        CD cd = new CD();
        cd.setPrice(10f);
        cd.setBandName("Maroon 5");
        cd.setTitle("Memories");
        cd.setReleaseDate(LocalDate.of(2019, 1, 8));
        mediaList.add(cd);

        DVD dvd = new DVD();
        dvd.setPrice(15f);
        dvd.setFilmLength(90f);
        dvd.setTitle("Schuh des Manitu");
        dvd.setReleaseDate(LocalDate.of(2001, 1, 8));
        mediaList.add(dvd);

        Book book = new Book();
        book.setPrice(12f);
        book.setISBNNumber("102983-12312-1231-12312");
        book.setTitle("Sunrise");
        book.setReleaseDate(LocalDate.of(2018, 1, 8));
        mediaList.add(book);

        displayList(mediaList);
    }

    private static void displayList(ArrayList<Media> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Media media = arrayList.get(i);
            System.out.println(media.getTitle());
            System.out.println(media.getPrice());
            System.out.println(media.getReleaseDate());

            if (arrayList.get(i).getClass() == CD.class) {
                CD cd = (CD) arrayList.get(i);
                System.out.println(cd.getBandName());
            } else if (arrayList.get(i).getClass() == DVD.class) {
                DVD dvd = (DVD) arrayList.get(i);
                System.out.println(dvd.getFilmLength());
            } else if (arrayList.get(i).getClass() == Book.class) {
                Book book = (Book) arrayList.get(i);
                System.out.println(book.getISBNNumber());
            }
            System.out.println("------------------------");
        }
    }
}
