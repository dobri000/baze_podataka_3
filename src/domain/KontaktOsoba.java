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
public class KontaktOsoba implements Serializable{
    private int sifraKontakta;
    private String ime;
    private String prezime;
    private String brojTelefona;
    private Klijent klijent;
    private String brojLK;

    public KontaktOsoba() {
    }

    public KontaktOsoba(int sifraKontakta, String ime, String prezime, String brojTelefona, Klijent klijent, String brojLK) {
        this.sifraKontakta = sifraKontakta;
        this.ime = ime;
        this.prezime = prezime;
        this.brojTelefona = brojTelefona;
        this.klijent = klijent;
        this.brojLK = brojLK;
    }

    public KontaktOsoba(String ime, String prezime, String brojTelefona, Klijent klijent, String brojLK) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojTelefona = brojTelefona;
        this.klijent = klijent;
        this.brojLK = brojLK;
    }

    public int getSifraKontakta() {
        return sifraKontakta;
    }

    public void setSifraKontakta(int sifraKontakta) {
        this.sifraKontakta = sifraKontakta;
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

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.sifraKontakta;
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
        final KontaktOsoba other = (KontaktOsoba) obj;
        return this.sifraKontakta == other.sifraKontakta;
    }
    
    
    
}
