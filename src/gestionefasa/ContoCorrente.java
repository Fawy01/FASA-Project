/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefasa;

/**
 *
 * @author pantaleo.fabio
 */
public class ContoCorrente{
    private float saldo;
    public ContoCorrente(float sal){
        this.saldo=sal;
    }
    public void preleva(float imp){
        if(imp>saldo){
            System.out.println("Non puoi prelevare questa somma");
        }else{
            saldo=saldo-imp;
        }
    }
    public void deposita(float dep){
        saldo=saldo+dep;
    }
    public float richiestasaldo(){
        return saldo;
    }
    public void mostra(){
 
        System.out.println("Saldo : "+saldo);
    }
}
