/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author dobri
 */
public class Ponuda implements Serializable{
    private int brPonude;
    private LocalDate datum;
    private String vremeDezuranja;
    private Zaposleni zaposleni;
    private int sifraObjekta;
    private String PIB;

    public Ponuda() {
    }

    public Ponuda(int brPonude, LocalDate datum, String vremeDezuranja, int sifraZaposlenog, int sifraObjekta, String PIB) {
        this.brPonude = brPonude;
        this.datum = datum;
        this.vremeDezuranja = vremeDezuranja;
        this.zaposleni = new Zaposleni(sifraZaposlenog);
        this.sifraObjekta = sifraObjekta;
        this.PIB = PIB;
    }

    public Ponuda(int brPonude, LocalDate datum, String vremeDezuranja, int sifraZaposlenog, int sifraObjekta) {
        this.brPonude = brPonude;
        this.datum = datum;
        this.vremeDezuranja = vremeDezuranja;
        this.zaposleni = new Zaposleni(sifraZaposlenog);
        this.sifraObjekta = sifraObjekta;
    }

    public Ponuda(int brPonude, LocalDate datum, String vremeDezuranja, Zaposleni zaposleni, int sifraObjekta, String PIB) {
        this.brPonude = brPonude;
        this.datum = datum;
        this.vremeDezuranja = vremeDezuranja;
        this.zaposleni = zaposleni;
        this.sifraObjekta = sifraObjekta;
        this.PIB = PIB;
    }
    
    
    

    public int getBrPonude() {
        return brPonude;
    }

    public void setBrPonude(int brPonude) {
        this.brPonude = brPonude;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getVremeDezuranja() {
        return vremeDezuranja;
    }

    public void setVremeDezuranja(String vremeDezuranja) {
        this.vremeDezuranja = vremeDezuranja;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public int getSifraObjekta() {
        return sifraObjekta;
    }

    public void setSifraObjekta(int sifraObjekta) {
        this.sifraObjekta = sifraObjekta;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    
    
}
