package com.tbz.d1;

public class Konto {
    private int kontoNr;
    private float saldo;
    private float min;

    public Konto(float min) {
        saldo = 100;
        this.min = min;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getKontoNr() {
        return kontoNr;
    }

    public void einzahlen(float saldo) {
        this.saldo += saldo;
    }

    public void abheben(float saldo) throws Exception {
        if (this.saldo - saldo > min)
            this.saldo -= saldo;
        else
            throw new Exception("Saldo cant be lower than " + min);
    }

    public void ueberweisen(Konto nachKonto, float betrag) throws Exception {
        this.abheben(betrag);
        nachKonto.einzahlen(betrag);
    }
}

