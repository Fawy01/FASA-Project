/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlli;

/**
 *
 * @author Fabio
 */
public class Controlli {
    
    
    public static boolean controllacodice(String c) {
        
        int i, l;
	boolean illecito=false;
        
        l=c.length();
        if(l!=16){
            return true;
        }

	for(i=0; i<6 && !illecito; i++){
            if(!(c.charAt(i)>='A' && c.charAt(i)<='Z')){
                illecito=true;
                return illecito;
            }
	}
        for(i=6; i<8 && !illecito; i++){
            if(!(c.charAt(i)>='0' && c.charAt(i)<='9')){
                illecito=true;
                return illecito;
            }
        }
        if(!(c.charAt(8)>='A' && c.charAt(8)<='Z')){
            illecito=true;
            return illecito;
        }
        for(i=9; i<11 && !illecito; i++){
            if(!(c.charAt(i)>='0' && c.charAt(i)<='9')){
                illecito=true;
                return illecito;
            }
        }
        if(!(c.charAt(11)>='A' && c.charAt(11)<='Z')){
            illecito=true;
            return illecito;
        }
        for(i=12; i<15 && !illecito; i++){
            if(!(c.charAt(i)>='0' && c.charAt(i)<='9')){
               illecito=true;
               return illecito;
            }
        }
        if(!(c.charAt(15)>='A' && c.charAt(15)<='Z')){
            illecito=true;
            return illecito;
        }
        return illecito;
    }
        
    public static boolean controllacivico(String nc) {
        
        int i, l;
        boolean illecito=false;
        
        if(nc==null || "".equals(nc))
            return true;
       
        l=nc.length();
        if(l==1) {
            if(nc.charAt(0)<'1' || nc.charAt(0)>'9')
                illecito=true;
        }
        else { 
            if(nc.charAt(0)=='0')
                illecito=true;
            else {
                for(i=1; i<l-1 && !illecito; i++) {
                    if(nc.charAt(i)<'0' || nc.charAt(i)>'9')
                        illecito=true;
                }
                
                if(!((nc.charAt(l-1)>='A' && nc.charAt(l-1)<='Z') || (nc.charAt(l-1)>='0' && nc.charAt(l-1)<='9')))
                    illecito=true;
            }
        }
        return illecito;
    }
    
    public static boolean controllanome(String nome) {

	int i, l, c=0;
	boolean illecito=false;
        
        if (nome==null || "".equals(nome))
            return true;
        
        nome=nome.toLowerCase();
        l=nome.length();
        for(i=0; i<l && !illecito; i++) {
            //39=Codice ASCII apostrofo
            if (!((nome.charAt(i)>='a' && nome.charAt(i)<='z') || nome.charAt(i)==' ' || nome.charAt(i)==39))
                illecito=true;
            else {
                if (nome.charAt(i)==' ' || nome.charAt(i)==39) {
                    if (i==0) {
                        illecito=true;
                        return illecito;
                    }
                    c++;
                    if(c==2) {
                       illecito=true;
                       return illecito; 
                    }
                }
                else
                    c=0;
            }
        }
        return illecito;
    }
    
    public static boolean controllominorenne(String dataOggi, String dataN) {
        int annoCorrente, annoData, eta, meseCorrente, giornoCorrente, meseData, giornoData;
        boolean illecito=false;
        
        annoCorrente=Integer.parseInt(dataOggi.substring(6));
        annoData=Integer.parseInt(dataN.substring(6));
        eta=annoCorrente-annoData;
        if(eta<18) 
            illecito=true;
        else {
            if(eta==18) {
                meseCorrente=Integer.parseInt(dataOggi.substring(3, 5));
                meseData=Integer.parseInt(dataN.substring(3, 5));
                if(meseCorrente-meseData<0) 
                    illecito=true;
                else {
                    if(meseData==meseCorrente) {
                        giornoCorrente=Integer.parseInt(dataOggi.substring(0, 2));
                        giornoData=Integer.parseInt(dataN.substring(0, 2));
                        if(giornoCorrente<giornoData) 
                            illecito=true;
                    }
                }
            }
        } 
        
        return illecito;
    }
    
    public static boolean controllacodiceIban(String c) {
        
        int i, l;
	boolean illecito=false;
        
        l=c.length();
        if(l!=27){
            return true;
        }

	for(i=0; i<2 && !illecito; i++){
            if(!(c.charAt(i)>='A' && c.charAt(i)<='Z')){
                illecito=true;
                return illecito;
            }
	}
        for(i=2; i<4 && !illecito; i++){
            if(!(c.charAt(i)>='0' && c.charAt(i)<='9')){
                illecito=true;
                return illecito;
            }
        }
        if(!(c.charAt(4)>='A' && c.charAt(4)<='Z')){
            illecito=true;
            return illecito;
        }
        for(i=5; i<26 && !illecito; i++){
            if(!(c.charAt(i)>='0' && c.charAt(i)<='9')){
                illecito=true;
                return illecito;
            }
        }
        return illecito;
    }
}
