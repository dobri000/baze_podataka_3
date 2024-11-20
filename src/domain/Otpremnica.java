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
public class Otpremnica implements Serializable {
    private int brojOtpremnice;
    private LocalDate date;
    private int sifraZaposlenog;
    private int sifraKontakta;
    private int sifraPrevoznika;

    public Otpremnica() {
    }

    public Otpremnica(int brojOtpremnice, LocalDate date, int sifraZaposlenog, int sifraKontakta, int PIB) {
        this.brojOtpremnice = brojOtpremnice;
        this.date = date;
        this.sifraZaposlenog = sifraZaposlenog;
        this.sifraKontakta = sifraKontakta;
        this.sifraPrevoznika = PIB;
    }

    public int getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(int brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSifraZaposlenog() {
        return sifraZaposlenog;
    }

    public void setSifraZaposlenog(int sifraZaposlenog) {
        this.sifraZaposlenog = sifraZaposlenog;
    }

    public int getSifraKontakta() {
        return sifraKontakta;
    }

    public void setSifraKontakta(int sifraKontakta) {
        this.sifraKontakta = sifraKontakta;
    }

    public int getSifraPrevoznika() {
        return sifraPrevoznika;
    }

    public void setSifraPrevoznika(int sifraPrevoznika) {
        this.sifraPrevoznika = sifraPrevoznika;
    }

    
}
