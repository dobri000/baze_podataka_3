/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import enumeration.JedinicaMere;
import java.io.Serializable;

/**
 *
 * @author dobri
 */
public class StavkaOtpremnice implements Serializable {
    private int brojOtpremnice;
    private int rbStavke;
    private int oznaka;
    private double kolicina;
    private JedinicaMere nazivJM;

    public StavkaOtpremnice() {
    }

    public StavkaOtpremnice(int rbStavke, int oznaka, double kolicina, JedinicaMere nazivJM) {
        this.rbStavke = rbStavke;
        this.oznaka = oznaka;
        this.kolicina = kolicina;
        this.nazivJM = nazivJM;
    }

    public StavkaOtpremnice(int brojOtpremnice, int rbStavke, int oznaka, double kolicina, JedinicaMere nazivJM) {
        this.brojOtpremnice = brojOtpremnice;
        this.rbStavke = rbStavke;
        this.oznaka = oznaka;
        this.kolicina = kolicina;
        this.nazivJM = nazivJM;
    }

    

    public int getRbStavke() {
        return rbStavke;
    }

    public void setRbStavke(int rbStavke) {
        this.rbStavke = rbStavke;
    }

    public int getOznaka() {
        return oznaka;
    }

    public void setOznaka(int oznaka) {
        this.oznaka = oznaka;
    }

    

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public JedinicaMere getNazivJM() {
        return nazivJM;
    }

    public void setNazivJM(JedinicaMere nazivJM) {
        this.nazivJM = nazivJM;
    }

    public int getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(int brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }
    
    
    
}
