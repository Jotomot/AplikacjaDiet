package pl.lublin.wsei.klasy;


import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;

public class Produkt {
    private String nazwa;
    private String marka;

    //sporo Boilerplatu, Można to podzielić na mniejszą klasę
    private float iloscTluszczow;
    private float iloscTluszczowNasyconych;
    private float iloscBialek;
    private float iloscWeglowodanow;
    private float iloscCukrow;
    private float iloscKCal;


    public Produkt() {

    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public float getIloscTluszczow() {
        return iloscTluszczow;
    }

    public void setIloscTluszczow(float iloscTluszczow) {
        this.iloscTluszczow = iloscTluszczow;
    }

    public float getIloscTluszczowNasyconych() {
        return iloscTluszczowNasyconych;
    }

    public void setIloscTluszczowNasyconych(float iloscTluszczowNasyconych) {
        this.iloscTluszczowNasyconych = iloscTluszczowNasyconych;
    }

    public float getIloscBialek() {
        return iloscBialek;
    }

    public void setIloscBialek(float iloscBialek) {
        this.iloscBialek = iloscBialek;
    }

    public float getIloscWeglowodanow() {
        return iloscWeglowodanow;
    }

    public void setIloscWeglowodanow(float iloscWeglowodanow) {
        this.iloscWeglowodanow = iloscWeglowodanow;
    }

    public float getIloscCukrow() {
        return iloscCukrow;
    }

    public void setIloscCukrow(float iloscCukrow) {
        this.iloscCukrow = iloscCukrow;
    }

    public float getIloscKCal() {
        return iloscKCal;
    }

    public void setIloscKCal(float iloscKCal) {
        this.iloscKCal = iloscKCal;
    }

    public PreparedStatement getPreparedStatement() {
        return null;
    }
}
