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
public class RadniDan implements Serializable {
    private int danUMesecu;
    private int sifraRadnogDnevnika;

    public RadniDan() {
    }

    public RadniDan(int danUMesecu) {
        this.danUMesecu = danUMesecu;
    }
    
    

    public RadniDan(int danUMesecu, int sifraRadnogDnevnika) {
        this.danUMesecu = danUMesecu;
        this.sifraRadnogDnevnika = sifraRadnogDnevnika;
    }

    public int getSifraRadnogDnevnika() {
        return sifraRadnogDnevnika;
    }

    public void setSifraRadnogDnevnika(int sifraRadnogDnevnika) {
        this.sifraRadnogDnevnika = sifraRadnogDnevnika;
    }
    
    

    public int getDanUMesecu() {
        return danUMesecu;
    }

    public void setDanUMesecu(int danUMesecu) {
        this.danUMesecu = danUMesecu;
    }
    
    
}
