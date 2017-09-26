/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ad972481
 */
public class Orange {
    private    Double prix;
    private    String  origine;
    
    //Constructeur de la classe
    public Orange(double p, String o)
    {
        prix = p;
        origine = o;
    }
    //Accesseur pour Prix
    public Double getPrix(){
        return prix;
    }
    public void setPrix(Double prx){
        prix = prx;
    }
    
   //Accesseur pour Origine
     public String getOrigine(){
        return origine;
    }
    public void setOrigine(String org){
        origine = org;
    }
    
    
    
}
