/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form1;

/**
 *
 * @author Cristopher Duarte Pimienta
 */
public class Form1 {

    public Form1(){
        
    }
    public long Calcular(long ValorBase,boolean fumador,boolean alcoholico,boolean drogadicto,boolean cardiaco){
        long total=0;
        double recFumador=0,recAlcoholico=0,recDrogadicto=0,recCardiaco=0;
        if(fumador){
            recFumador=ValorBase*0.10;
        }
        if(alcoholico){
            recAlcoholico=ValorBase*0.20;
        }
        if(drogadicto){
            recDrogadicto=ValorBase*0.25;
        }
        if(cardiaco){
            recCardiaco=ValorBase*0.30;
        }
        total= (long)(ValorBase-(recFumador+recAlcoholico+recDrogadicto+recCardiaco));
        return total;    
    }
}