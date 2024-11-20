/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author dobri
 */
public class Adresa {
    private int sifraAdrese;
    private int sifraGrada;
    private String ulica;
    private int broj;
    private String nazivGrada;

    public Adresa() {
    }

    public Adresa(int sifraAdrese, int sifraGrada, String ulica, int broj, String nazivGrada) {
        this.sifraAdrese = sifraAdrese;
        this.sifraGrada = sifraGrada;
        this.ulica = ulica;
        this.broj = broj;
        this.nazivGrada = nazivGrada;
    }

    public Adresa(int sifraAdrese, int sifraGrada, String ulica, int broj) {
        this.sifraAdrese = sifraAdrese;
        this.sifraGrada = sifraGrada;
        this.ulica = ulica;
        this.broj = broj;
    }
    
    

    

    public int getSifraAdrese() {
        return sifraAdrese;
    }

    public void setSifraAdrese(int sifraAdrese) {
        this.sifraAdrese = sifraAdrese;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public int getSifraGrada() {
        return sifraGrada;
    }

    public void setSifraGrada(int sifraGrada) {
        this.sifraGrada = sifraGrada;
    }

    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.sifraAdrese;
        hash = 31 * hash + this.sifraGrada;
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
        final Adresa other = (Adresa) obj;
        if (this.sifraAdrese != other.sifraAdrese) {
            return false;
        }
        return this.sifraGrada == other.sifraGrada;
    }

    
    
    
}
