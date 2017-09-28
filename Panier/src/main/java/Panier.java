//traitement
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
    
    private ArrayList<Orange> listOrange  = new ArrayList<Orange>();
    private int taille;
    
    //Constructeur
   public Panier(int t)
    {
        taille = t;
    }
    
    //Accesseur 
    public ArrayList getListOrange(){
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
        String s="";
        for (Orange o : listOrange)
        {
            s+= o.getOrange();
            
        }
    }
                
    
}
