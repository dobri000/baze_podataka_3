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
public class RadniNalogOsnovno {
    private int brojRadnogNaloga;
    private LocalDate datumOtvaranjaRN;
    private int brPonude;
    private int sifraZaposlenog;

    public RadniNalogOsnovno() {
    }

    
    
    public RadniNalogOsnovno(int brojRadnogNaloga, LocalDate datumOtvaranjaRN, int brPonude, int sifraZaposlenog) {
        this.brojRadnogNaloga = brojRadnogNaloga;
        this.datumOtvaranjaRN = datumOtvaranjaRN;
        this.brPonude = brPonude;
        this.sifraZaposlenog = sifraZaposlenog;
    }

    public int getBrojRadnogNaloga() {
        return brojRadnogNaloga;
    }

    public void setBrojRadnogNaloga(int brojRadnogNaloga) {
        this.brojRadnogNaloga = brojRadnogNaloga;
    }

    public LocalDate getDatumOtvaranjaRN() {
        return datumOtvaranjaRN;
    }

    public void setDatumOtvaranjaRN(LocalDate datumOtvaranjaRN) {
        this.datumOtvaranjaRN = datumOtvaranjaRN;
    }

    public int getBrPonude() {
        return brPonude;
    }

    public void setBrPonude(int brPonude) {
        this.brPonude = brPonude;
    }

    public int getSifraZaposlenog() {
        return sifraZaposlenog;
    }

    public void setSifraZaposlenog(int sifraZaposlenog) {
        this.sifraZaposlenog = sifraZaposlenog;
    }
    
    
    
}
