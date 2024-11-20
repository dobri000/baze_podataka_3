/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author dobri
 */
public class PutniIzvestaj implements Serializable {
    private int sifraPI;
    private LocalDate datum;
    private Zaposleni zaposleni;
    private Zaposleni serviser;
    private List<StavkaPI> putovanja;

    public PutniIzvestaj() {
    }

    public PutniIzvestaj(int sifraPI, LocalDate datum, Zaposleni zaposleni, Zaposleni serviser, List<StavkaPI> putovanja) {
        this.sifraPI = sifraPI;
        this.datum = datum;
        this.zaposleni = zaposleni;
        this.serviser = serviser;
        this.putovanja = putovanja;
    }

    public int getSifraPI() {
        return sifraPI;
    }

    public void setSifraPI(int sifraPI) {
        this.sifraPI = sifraPI;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getServiser() {
        return serviser;
    }

    public void setServiser(Zaposleni serviser) {
        this.serviser = serviser;
    }

    public List<StavkaPI> getPutovanja() {
        return putovanja;
    }

    public void setPutovanja(List<StavkaPI> putovanja) {
        this.putovanja = putovanja;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.sifraPI;
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
        final PutniIzvestaj other = (PutniIzvestaj) obj;
        return this.sifraPI == other.sifraPI;
    }
    
    
}
