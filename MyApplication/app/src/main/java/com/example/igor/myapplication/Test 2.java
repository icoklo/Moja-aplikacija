package com.example.igor.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor on 31.10.2015..
 */
public class Test {
    public String ime;
    public String prezime;
    public int port;
    public static List<Test> lista= new ArrayList<Test>();
    // static označava da se svaki put kad se stvori nova instanca
    // Test klase, ne stvara se nova lista za svaku instancu već postoji samo jedna
    // instanca liste koju mogu dijeliti sve instance klase Test

    public Test(){

    }

    public Test(String ime, String prezime, int port) {
        this.ime = ime;
        this.prezime = prezime;
        this.port = port;
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

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
