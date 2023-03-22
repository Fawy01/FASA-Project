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
public class Persona implements Serializable{
    public String codfisc;
    public String nome;
    public String cognome;
    public String data;
    public String s;
    public String via;
    public String numerocivico;
    public String residenza;
    
    public Persona(String cf, String n, String c, String d, String s, String v, String nc, String r){
            this.codfisc=cf;
            this.nome=n;
            this.cognome=c;
            this.data=d;
            this.s=s;
            this.via=v;
            this.numerocivico=nc;
            this.residenza=r;
    }
    
    public void Stampa(){
        System.out.println("Codice Fiscale: "+codfisc);
        System.out.println("Nome: "+nome);
        System.out.println("Cognome: "+cognome);
        System.out.println("Data di nascita: "+data);
        System.out.println("Sesso: "+s);
        System.out.println("Residenza: "+residenza);
        System.out.println("Via: "+via);
        System.out.println("Numero civico: "+numerocivico);
        
    }
    
    
}
