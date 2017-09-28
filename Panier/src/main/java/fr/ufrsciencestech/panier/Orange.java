package fr.ufrsciencestech.panier;

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
        this.prix = p;
        this.origine = o;
    }
    //Accesseur pour Prix
    public Double getPrix(){
        return this.prix;
    }
    public void setPrix(Double prx){
        this.prix = prx;
    }
    
   //Accesseur pour Origine
     public String getOrigine(){
        return this.origine;
    }
    public void setOrigine(String org){
        this.origine = org;
    }
    
    public String toString()
    {
        String s=" ";
        s += this.prix;
        s += this.origine;
        return s;
    }
    public boolean equals(Object obj)
    {
        Orange o = (Orange)obj;
       return (this.prix == o.prix && this.origine.equals(o.origine));
    }
    
}
