/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefasa;

import java.io.*;

/**
 *
 * @author Fabio
 */
public class Personale extends Persona implements Serializable{

    public String FId;
    public String special;
    public String pass;
    public String email;
    public int ore;
    public int figli;
    public double stipendio;
    public Personale(String cf, String n, String c, String d, String s, String v, String nc, String r, String fid, String special, String pass, double stipendio, String email) {
        super(cf, n, c, d, s, v, nc, r);
        this.FId = fid;
        this.special = special;
        this.pass=pass;
        this.ore=0;
        this.figli=0;
        this.stipendio=stipendio;
        this.email=email;
    }
}
