/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author dobri
 */
public class StavkaPI implements Serializable {
    private int rbStavke;
    private LocalDateTime odlazak;
    private LocalDateTime dolazak;
    private Grad gradA;
    private Grad gradB;
    private Objekat objekat;

    public StavkaPI() {
    }

    public StavkaPI(int rbStavke, LocalDateTime odlazak, LocalDateTime dolazak, Grad gradA, Grad gradB, Objekat objekat) {
        this.rbStavke = rbStavke;
        this.odlazak = odlazak;
        this.dolazak = dolazak;
        this.gradA = gradA;
        this.gradB = gradB;
        this.objekat = objekat;
    }

    public int getRbStavke() {
        return rbStavke;
    }

    public void setRbStavke(int rbStavke) {
        this.rbStavke = rbStavke;
    }

    public LocalDateTime getOdlazak() {
        return odlazak;
    }

    public void setOdlazak(LocalDateTime odlazak) {
        this.odlazak = odlazak;
    }

    public LocalDateTime getDolazak() {
        return dolazak;
    }

    public void setDolazak(LocalDateTime dolazak) {
        this.dolazak = dolazak;
    }

    public Grad getGradA() {
        return gradA;
    }

    public void setGradA(Grad gradA) {
        this.gradA = gradA;
    }

    public Grad getGradB() {
        return gradB;
    }

    public void setGradB(Grad gradB) {
        this.gradB = gradB;
    }

    public Objekat getObjekat() {
        return objekat;
    }

    public void setObjekat(Objekat objekat) {
        this.objekat = objekat;
    }
    
    
}
