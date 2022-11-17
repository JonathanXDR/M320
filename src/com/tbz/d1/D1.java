package com.tbz.d1;

public class D1 {
    public void Start() {
        Konto konto1 = new Konto(-200);
        Konto konto2 = new Konto(-300);
        Konto konto3 = new Konto(-400);

        try {
            konto1.ueberweisen(konto2, 30f);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        konto2.einzahlen(200);

        try {
            konto2.ueberweisen(konto3, 150f);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            konto2.abheben( 1500f);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Konto 1");
        System.out.println(konto1.getSaldo());

        System.out.println("Konto 2");
        System.out.println(konto2.getSaldo());

        System.out.println("Konto 3");
        System.out.println(konto3.getSaldo());
    }
}
