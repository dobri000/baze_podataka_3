/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import enumeration.Mesec;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dobri
 */
public class RadniDnevnik implements Serializable {
    private int sifraRadnogDnevnika;
    private int sifraZaposlenog;
    private int sifraKontrolera;
    private Mesec mesec;
    private int godina;
    private RadniSati ukupniRadniSati;

    public RadniDnevnik(int sifraRadnogDnevnika, int sifraZaposlenog, int sifraKontrolera, Mesec mesec, int godina, RadniSati radniSati) {
        this.sifraRadnogDnevnika = sifraRadnogDnevnika;
        this.sifraZaposlenog = sifraZaposlenog;
        this.sifraKontrolera = sifraKontrolera;
        this.mesec = mesec;
        this.godina = godina;
        this.ukupniRadniSati = radniSati;
    }

    public RadniDnevnik(int sifraRadnogDnevnika, int sifraZaposlenog, int sifraKontrolera, Mesec mesec, int godina) {
        this.sifraRadnogDnevnika = sifraRadnogDnevnika;
        this.sifraZaposlenog = sifraZaposlenog;
        this.sifraKontrolera = sifraKontrolera;
        this.mesec = mesec;
        this.godina = godina;
    }

    

    public RadniDnevnik() {
    }

    public int getSifraRadnogDnevnika() {
        return sifraRadnogDnevnika;
    }

    public void setSifraRadnogDnevnika(int sifraRadnogDnevnika) {
        this.sifraRadnogDnevnika = sifraRadnogDnevnika;
    }

    public Mesec getMesec() {
        return mesec;
    }

    public void setMesec(Mesec mesec) {
        this.mesec = mesec;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public RadniSati getRadniSati() {
        return ukupniRadniSati;
    }

    public void setRadniSati(RadniSati radniSati) {
        this.ukupniRadniSati = radniSati;
    }

    public int getSifraZaposlenog() {
        return sifraZaposlenog;
    }

    public void setSifraZaposlenog(int sifraZaposlenog) {
        this.sifraZaposlenog = sifraZaposlenog;
    }

    public int getSifraKontrolera() {
        return sifraKontrolera;
    }

    public void setSifraKontrolera(int sifraKontrolera) {
        this.sifraKontrolera = sifraKontrolera;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.sifraRadnogDnevnika;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RadniDnevnik other = (RadniDnevnik) obj;
        return this.sifraRadnogDnevnika == other.sifraRadnogDnevnika;
    }
    
    
}
