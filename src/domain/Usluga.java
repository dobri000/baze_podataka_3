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
public class Usluga implements Serializable {
    private int sifraUsluge;
    private String nazivUsluge;
    private String opisUsluge;

    public Usluga() {
    }

    public Usluga(int sifraUsluge, String nazivUsluge, String opisUsluge) {
        this.sifraUsluge = sifraUsluge;
        this.nazivUsluge = nazivUsluge;
        this.opisUsluge = opisUsluge;
    }

    public int getSifraUsluge() {
        return sifraUsluge;
    }

    public void setSifraUsluge(int sifraUsluge) {
        this.sifraUsluge = sifraUsluge;
    }

    public String getNazivUsluge() {
        return nazivUsluge;
    }

    public void setNazivUsluge(String nazivUsluge) {
        this.nazivUsluge = nazivUsluge;
    }

    public String getOpisUsluge() {
        return opisUsluge;
    }

    public void setOpisUsluge(String opisUsluge) {
        this.opisUsluge = opisUsluge;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.sifraUsluge;
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
        final Usluga other = (Usluga) obj;
        return this.sifraUsluge == other.sifraUsluge;
    }
    
    
}
