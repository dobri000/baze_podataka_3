/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDate;

/**
 *
 * @author dobri
 */
public class RadniNalogDetaljno {
    private int brojRadnogNaloga;
    private LocalDate rokZaRealizaciju;
    private String opisSistema;
    private String obavljenRad;
    private LocalDate datumObavljanjaKontrole;
    private int sifraKontakta;
    private int sifraGrada;

    public RadniNalogDetaljno() {
    }

    public RadniNalogDetaljno(int brojRadnogNaloga, LocalDate rokZaRealizaciju, String opisSistema, String obavljenRad, LocalDate datumObavljanjaKontrole, int sifraKontakta, int sifraGrada) {
        this.brojRadnogNaloga = brojRadnogNaloga;
        this.rokZaRealizaciju = rokZaRealizaciju;
        this.opisSistema = opisSistema;
        this.obavljenRad = obavljenRad;
        this.datumObavljanjaKontrole = datumObavljanjaKontrole;
        this.sifraKontakta = sifraKontakta;
        this.sifraGrada = sifraGrada;
    }

    public int getBrojRadnogNaloga() {
        return brojRadnogNaloga;
    }

    public void setBrojRadnogNaloga(int brojRadnogNaloga) {
        this.brojRadnogNaloga = brojRadnogNaloga;
    }

    public LocalDate getRokZaRealizaciju() {
        return rokZaRealizaciju;
    }

    public void setRokZaRealizaciju(LocalDate rokZaRealizaciju) {
        this.rokZaRealizaciju = rokZaRealizaciju;
    }

    public String getOpisSistema() {
        return opisSistema;
    }

    public void setOpisSistema(String opisSistema) {
        this.opisSistema = opisSistema;
    }

    public String getObavljenRad() {
        return obavljenRad;
    }

    public void setObavljenRad(String obavljenRad) {
        this.obavljenRad = obavljenRad;
    }

    public LocalDate getDatumObavljanjaKontrole() {
        return datumObavljanjaKontrole;
    }

    public void setDatumObavljanjaKontrole(LocalDate datumObavljanjaKontrole) {
        this.datumObavljanjaKontrole = datumObavljanjaKontrole;
    }

    public int getSifraKontakta() {
        return sifraKontakta;
    }

    public void setSifraKontakta(int sifraKontakta) {
        this.sifraKontakta = sifraKontakta;
    }

    public int getSifraGrada() {
        return sifraGrada;
    }

    public void setSifraGrada(int sifraGrada) {
        this.sifraGrada = sifraGrada;
    }
    
    
    
}
