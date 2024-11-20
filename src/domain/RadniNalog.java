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
public class RadniNalog implements Serializable {
    private int brojRadnogNaloga;
    private LocalDate rokZaRealizaciju;
    private String opisSistema;
    private String obavljenRad;
    private LocalDate datumOtvaranjaRN;
    private LocalDate datumObavljanjaKontrole;
    private int brPonude;
    private int sifraKontakta;
    private int sifraZaposlenog;
    private int sifraGrada;

    public RadniNalog() {
    }

    public RadniNalog(int brojRadnogNaloga, LocalDate rokZaRealizaciju, String opisSistema, String obavljenRad, LocalDate datumOtvaranjaRN, LocalDate datumObavljanjaKontrole, int brPonude, int sifraKontakta, int sifraZaposlenog, int sifraGrada) {
        this.brojRadnogNaloga = brojRadnogNaloga;
        this.rokZaRealizaciju = rokZaRealizaciju;
        this.opisSistema = opisSistema;
        this.obavljenRad = obavljenRad;
        this.datumOtvaranjaRN = datumOtvaranjaRN;
        this.datumObavljanjaKontrole = datumObavljanjaKontrole;
        this.brPonude = brPonude;
        this.sifraKontakta = sifraKontakta;
        this.sifraZaposlenog = sifraZaposlenog;
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

    public LocalDate getDatumOtvaranjaRN() {
        return datumOtvaranjaRN;
    }

    public void setDatumOtvaranjaRN(LocalDate datumOtvaranjaRN) {
        this.datumOtvaranjaRN = datumOtvaranjaRN;
    }

    public LocalDate getDatumObavljanjaKontrole() {
        return datumObavljanjaKontrole;
    }

    public void setDatumObavljanjaKontrole(LocalDate datumObavljanjaKontrole) {
        this.datumObavljanjaKontrole = datumObavljanjaKontrole;
    }

    public int getBrPonude() {
        return brPonude;
    }

    public void setBrPonude(int brPonude) {
        this.brPonude = brPonude;
    }

    public int getSifraKontakta() {
        return sifraKontakta;
    }

    public void setSifraKontakta(int sifraKontakta) {
        this.sifraKontakta = sifraKontakta;
    }

    public int getSifraZaposlenog() {
        return sifraZaposlenog;
    }

    public void setSifraZaposlenog(int sifraZaposlenog) {
        this.sifraZaposlenog = sifraZaposlenog;
    }

    public int getSifraGrada() {
        return sifraGrada;
    }

    public void setSifraGrada(int sifraGrada) {
        this.sifraGrada = sifraGrada;
    }

    
    
    
}
