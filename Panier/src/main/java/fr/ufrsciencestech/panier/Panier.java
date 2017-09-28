package fr.ufrsciencestech.panier;


import fr.ufrsciencestech.panier.Orange;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ad972481
 */
public class Panier {
    
    private ArrayList<Orange> listOrange;
    private int taille;
    
    //Constructeur
   public Panier(int t)
    {
        this.taille = t;
        listOrange = new java.util.ArrayList();
    }
    
    //Accesseur 
    public ArrayList<Orange> getListOrange(){
        return listOrange;
    }
    
    public void setListOrane(ArrayList<Orange> lo){
        listOrange = lo;
    }
    
    //Méthode 
    
    private boolean estPlein()
    {
        int lg = this.listOrange.size();
        if(lg != 0 )
            return true;
        else return false;
    }
     
    private boolean estVide()
    {
     int lg = this.listOrange.size();
     if(lg == 0) return false;
     else return true;
    }
    
    public String ToString()
    {
        for (int i=0; i <= listOrange.size();i++)
        {
            System.out.println(listOrange.get(i));
        }
    }
    
}
