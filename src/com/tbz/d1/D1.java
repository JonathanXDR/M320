package com.tbz.d1;

public class D1 {
    public void Start() {
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        konto1.ueberweisen(konto2, 30f);

        konto2.einzahlen(200);
        konto2.ueberweisen(konto3, 150f);

        System.out.println("Konto 1");
        System.out.println(konto1.getSaldo());

        System.out.println("Konto 2");
        System.out.println(konto2.getSaldo());

        System.out.println("Konto 3");
        System.out.println(konto3.getSaldo());
    }
}
