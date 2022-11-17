package com.tbz.d1;

public class Konto {
    private int kontoNr;
    private float saldo;
    public Konto(){
        saldo = 100;
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
    public void abheben(float saldo){
        this.saldo -= saldo;
    }
    public void ueberweisen(Konto nachKonto, float betrag){
        this.abheben(betrag);
        nachKonto.einzahlen(betrag);
    }
}

