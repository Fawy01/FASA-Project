/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefasa;

import java.io.*;

/**
 *
 * @author pantaleo.fabio
 */
public class Banca implements Serializable{
    String iban;
    double saldo;
    String LastPre;
    
    public Banca(String i){
        this.iban=i;
        this.saldo=0;
        this.LastPre="";
    }
    public void compra(float imp){
        if(imp>saldo){
            System.out.println("Non puoi prelevare questa somma");
        }else{
            saldo=saldo-imp;
        }
    }
    public void retribuzione(float dep){
        saldo=saldo+dep;
    }
}
