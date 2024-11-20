/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author dobri
 */
public class Angazovanje implements Serializable {
    private int sifraRadnogDnevnika;
    private int danUMesecu;
    private int sifraObjekta;
    private RadniSati radniSati;

    public Angazovanje() {
    }

    public Angazovanje(int danUMesecu, int objekat, RadniSati radniSati) {
        this.danUMesecu = danUMesecu;
        this.sifraObjekta = objekat;
        this.radniSati = radniSati;
    }

    public Angazovanje(int sifraRadnogDnevnika, int danUMesecu, int sifraObjekta, RadniSati radniSati) {
        this.sifraRadnogDnevnika = sifraRadnogDnevnika;
        this.danUMesecu = danUMesecu;
        this.sifraObjekta = sifraObjekta;
        this.radniSati = radniSati;
    }
    
    

    public int getSifraObjekta() {
        return sifraObjekta;
    }

    public void setSifraObjekta(int sifraObjekta) {
        this.sifraObjekta = sifraObjekta;
    }

    public RadniSati getRadniSati() {
        return radniSati;
    }

    public void setRadniSati(RadniSati radniSati) {
        this.radniSati = radniSati;
    }

    public int getDanUMesecu() {
        return danUMesecu;
    }

    public void setDanUMesecu(int danUMesecu) {
        this.danUMesecu = danUMesecu;
    }

    public int getSifraRadnogDnevnika() {
        return sifraRadnogDnevnika;
    }

    public void setSifraRadnogDnevnika(int sifraRadnogDnevnika) {
        this.sifraRadnogDnevnika = sifraRadnogDnevnika;
    }

    
    
    
    
}
