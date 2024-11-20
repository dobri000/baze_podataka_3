/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dobri
 */
public class Zaposleni implements Serializable {
    private int sifraZaposlenog;
    private String ime;
    private String prezime;
    private String email;
    private String brojLK;
    private List<Telefon> telefoni;

    public Zaposleni() {
    }
    
    public Zaposleni(int sifraZaposlenog) {
        this.sifraZaposlenog = sifraZaposlenog;
    }

    public Zaposleni(int sifraZaposlenog, String ime, String prezime, String brojLK) {
        this.sifraZaposlenog = sifraZaposlenog;
        this.ime = ime;
        this.prezime = prezime;
        this.brojLK = brojLK;
    }
    
    

    public Zaposleni(int sifraZaposlenog, String ime, String prezime, String email, String brojLK, List<Telefon> telefoni) {
        this.sifraZaposlenog = sifraZaposlenog;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.brojLK = brojLK;
        this.telefoni = telefoni;
    }

    public int getSifraZaposlenog() {
        return sifraZaposlenog;
    }

    public void setSifraZaposlenog(int sifraZaposlenog) {
        this.sifraZaposlenog = sifraZaposlenog;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    public List<Telefon> getTelefoni() {
        return telefoni;
    }

    public void setTelefoni(List<Telefon> telefoni) {
        this.telefoni = telefoni;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.sifraZaposlenog;
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
        final Zaposleni other = (Zaposleni) obj;
        return this.sifraZaposlenog == other.sifraZaposlenog;
    }
    
    
}
