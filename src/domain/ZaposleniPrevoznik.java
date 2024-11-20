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
public class ZaposleniPrevoznik implements Serializable {
    private int sifraPrevoznika;
    private String ime;
    private String prezime;
    private String brojLK;
    private Prevoznik prevoznik;

    public ZaposleniPrevoznik() {
    }

    public ZaposleniPrevoznik(int sifraPrevoznika, String ime, String prezime, String brojLK, Prevoznik prevoznik) {
        this.sifraPrevoznika = sifraPrevoznika;
        this.ime = ime;
        this.prezime = prezime;
        this.brojLK = brojLK;
        this.prevoznik = prevoznik;
    }

    public int getSifraPrevoznika() {
        return sifraPrevoznika;
    }

    public void setSifraPrevoznika(int sifraPrevoznika) {
        this.sifraPrevoznika = sifraPrevoznika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    public Prevoznik getPrevoznik() {
        return prevoznik;
    }

    public void setPrevoznik(Prevoznik prevoznik) {
        this.prevoznik = prevoznik;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.sifraPrevoznika;
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
        final ZaposleniPrevoznik other = (ZaposleniPrevoznik) obj;
        return this.sifraPrevoznika == other.sifraPrevoznika;
    }
    
    
    
}
